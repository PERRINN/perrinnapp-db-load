/*************************************************************/
/* Copyright (C) 2016, PERRINN Limited.  All Rights Reserved */
/*                                                           */
/* This software is distributed under the Apache 2.0 license */
/* For usage rights, please contact contact@perrinn.com      */
/*                                                           */
/*************************************************************/
/* This module developed by Christopher Moran                */
/*************************************************************/

package com.perrinn.appservice.dbloader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * @author chris
 *
 */
public class Config {
	private String dbSource;
	private String dbName;
	private String dbUser;
	private String dbPassword;
	private String dbDriver;

	public String getDatabaseString() {
		if(this.dbDriver.equals("com.mysql.jdbc.Driver"))
			return "jdbc:mysql://" + this.dbSource + "/" + this.dbName;

		if(this.dbDriver.equals("org.h2.Driver"))
			return "jdbc:h2:mem:" + this.dbName + ";DB_CLOSE_DELAY=-1"; 

		if(this.dbDriver.equals("oracle.jdbc.driver.OracleDriver"))
			return "jdbc:oracle:thin:" + this.dbUser + "/" + this.dbName + "@" + this.dbName;
		
		return null;
	}

	public String getDatabaseServer() {
		return this.dbSource;
	}

	public String getDatabaseName() {
		return this.dbName;
	}

	public String getDatabaseUser() {
		return this.dbUser;
	}

	public String getDatabasePassword() {
		return this.dbPassword;
	}

	public String getDatabaseDriver() {
		return this.dbDriver;
	}

	public void setDatabaseServer(String val) {
		this.dbSource = val;
	}

	public void setDatabaseName(String val) {
		this.dbName = val;
	}

	public void setDatabaseUser(String val) {
		this.dbUser = val;
	}

	public void setDatabasePassword(String val) {
		this.dbPassword = val;
	}

	public void setDatabaseDriver(String val) {
		this.dbDriver = val;
	}

	private void initLocals() {
		this.dbSource = "localhost";
		this.dbName = "perrapp";
		this.dbUser = "user";
		this.dbPassword = "password";
		this.dbDriver = "com.mysql.jdbc.Driver";
	}

	public Config() {
		this.initLocals();
		this.read();
	}

	public void read() {
		InputStream in = null;
		Properties props = new Properties();

		try {
			in = new FileInputStream("config.properties");

			// Load properties
			props.load(in);
			this.dbSource = props.getProperty("data_source");
			this.dbName = props.getProperty("database");
			this.dbUser = props.getProperty("database_user");
			this.dbPassword = props.getProperty("database_password");
			this.dbDriver = props.getProperty("database_driver");
		}
		catch(FileNotFoundException ex) {
			System.err.println("No config found.  Applying defaults");
			this.save();
		}
		catch(Exception ex) {
			System.err.println(ex.toString());
		}
		finally {
			try {
				if(in != null) {
					in.close();
				}
			}
			catch(Exception ex) {
				System.out.println(ex.toString());
			}
		}
	}

	public void save() {
		OutputStream out = null;
		Properties props = new Properties();

		try {
			out = new FileOutputStream("config.properties");

			// Set the props values
			props.setProperty("data_source", this.dbSource);
			props.setProperty("database", this.dbName);
			props.setProperty("database_user", this.dbUser);
			props.setProperty("database_password", this.dbPassword);
			props.setProperty("database_driver", this.dbDriver);

			// and save them
			props.store(out, null);
		}
		catch(Exception ex) {
			System.err.println(ex.toString());
		}
		finally {
			if(out != null) {
				try {
					out.close();
				}
				catch(Exception ex) {
					System.err.println(ex.toString());
				}
			}
		}
	}
}

