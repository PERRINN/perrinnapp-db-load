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

import java.sql.*;

/**
 * @author chris
 *
 */
public class DbLoader {
	private Connection conn;

	/**
	 * @param args
	 */
	public void main(String[] args) {
		this.conn = null;

		if(!this.dbOpen())
		{
			if(!this.loadCountry()) {
				
			}
			this.dbClose();
		}
		else
		{
			System.err.println("Operation failed.  See previous errors");
		}
		
	}
	
	private Boolean loadCountry() {
		boolean ret = false;
		String sql = null;
		Statement stmt = null;
		PreparedStatement ps = null;
		
		try {
			sql = "CREATE TABLE country ("
					+ " id INTEGER PRIMARY KEY AUTO_INCREMENT,"
					+ " country_code CHAR(5) NOT NULL,"
					+ " country_name VARCHAR(255) NOT NULL,"
					+ " has_division SMALLINT NOT NULL,"
					+ " division_name VARCHAR(255)"
					+ ")";
				stmt = this.conn.createStatement();
				stmt.execute(sql);
				stmt.close();
				
				this.conn.setAutoCommit(false);
				sql = "INSERT INTO country(country_name, country_code, has_division, division_name) VALUES(?,?,?,?)";
				ps = this.conn.prepareStatement(sql);
				
				ps.setString(1, "Afghanistan");
				ps.setString(2, "AFG");
				ps.setInt(3, 1);
				ps.setString(4, "Province");
				ps.addBatch();

				ps.setString(1, "Åland Islands");
				ps.setString(2, "ALA");
				ps.setInt(3, 1);
				ps.setString(4, "Municipality");
				ps.addBatch();

				ps.setString(1, "Albania");
				ps.setString(2, "ALB");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Algeria");
				ps.setString(2, "DZA");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "American Samoa");
				ps.setString(2, "ASM");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Andorra");
				ps.setString(2, "AND");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Angola");
				ps.setString(2, "AGO");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Anguilla");
				ps.setString(2, "AIA");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Antarctica");
				ps.setString(2, "ATA");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Antigua and Barbuda");
				ps.setString(2, "ATG");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Argentina");
				ps.setString(2, "ARG");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Armenia");
				ps.setString(2, "ARM");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Aruba");
				ps.setString(2, "ABW");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Australia");
				ps.setString(2, "AUS");
				ps.setInt(3, 1);
				ps.setString(4, "State");
				ps.addBatch();

				ps.setString(1, "Austria");
				ps.setString(2, "AUT");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Azerbaijan");
				ps.setString(2, "AZE");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Bahamas");
				ps.setString(2, "BHS");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Bahrain");
				ps.setString(2, "BHR");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Bangladesh");
				ps.setString(2, "BGD");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Barbados");
				ps.setString(2, "BRB");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Belarus");
				ps.setString(2, "BLR");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Belgium");
				ps.setString(2, "BEL");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Belize");
				ps.setString(2, "BLZ");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Benin");
				ps.setString(2, "BEN");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Bermuda");
				ps.setString(2, "BMU");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Bhutan");
				ps.setString(2, "BTN");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Bolivia");
				ps.setString(2, "BOL");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Bosnia and Herzegovina");
				ps.setString(2, "BIH");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Botswana");
				ps.setString(2, "BWA");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Bouvet Island");
				ps.setString(2, "BVT");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Brazil");
				ps.setString(2, "BRA");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "British Virgin Islands");
				ps.setString(2, "VGB");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "British Indian Ocean Territory");
				ps.setString(2, "IOT");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Brunei Darussalam");
				ps.setString(2, "BRN");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Bulgaria");
				ps.setString(2, "BGR");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Burkina Faso");
				ps.setString(2, "BFA");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Burundi");
				ps.setString(2, "BDI");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Cambodia");
				ps.setString(2, "KHM");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Cameroon");
				ps.setString(2, "CMR");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Canada");
				ps.setString(2, "CAN");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Cape Verde");
				ps.setString(2, "CPV");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Cayman Islands");
				ps.setString(2, "CYM");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Central African Republic");
				ps.setString(2, "CAF");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Chad");
				ps.setString(2, "TCD");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Chile");
				ps.setString(2, "CHL");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "China");
				ps.setString(2, "CHN");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Christmas Island");
				ps.setString(2, "CXR");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Cocos (Keeling) Islands");
				ps.setString(2, "CCK");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Colombia");
				ps.setString(2, "COL");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Comoros");
				ps.setString(2, "COM");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Congo (Brazzaville");
				ps.setString(2, "COG");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Congo, Democratic Republic of The");
				ps.setString(2, "COD");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Cook Islands");
				ps.setString(2, "COK`");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Costa Rica");
				ps.setString(2, "CRI");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Côte d''Ivoire");
				ps.setString(2, "CIV");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Croatia");
				ps.setString(2, "HRV");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Cuba");
				ps.setString(2, "CUB");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Cyprus");
				ps.setString(2, "CYP");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Czech Republic");
				ps.setString(2, "CZE");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Denmark");
				ps.setString(2, "DNK");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Djibouti");
				ps.setString(2, "DJI");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Dominica");
				ps.setString(2, "DMA");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Dominican Republic");
				ps.setString(2, "DOM");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Ecuador");
				ps.setString(2, "ECU");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Egypt");
				ps.setString(2, "EGY");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "El Salvador");
				ps.setString(2, "SLV");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Equatorial Guinea");
				ps.setString(2, "GNQ");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Eritrea");
				ps.setString(2, "ERI");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Estonia");
				ps.setString(2, "EST");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Ethiopia");
				ps.setString(2, "ETH");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Falkland Islands (Malvinas)");
				ps.setString(2, "FLK");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Faroe Islands");
				ps.setString(2, "FRO");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Fiji");
				ps.setString(2, "FJI");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Finland");
				ps.setString(2, "FIN");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "France");
				ps.setString(2, "FRA");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "French Guiana");
				ps.setString(2, "GUF");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "French Polynesia");
				ps.setString(2, "PYF");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "French Southern Territories");
				ps.setString(2, "ATF");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Gabon");
				ps.setString(2, "GAB");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Gambia");
				ps.setString(2, "GMB");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Georgia");
				ps.setString(2, "GEO");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Germany");
				ps.setString(2, "DEU");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Ghana");
				ps.setString(2, "GHA");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Gibraltar");
				ps.setString(2, "GIB");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Greece");
				ps.setString(2, "GRC");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Greenland");
				ps.setString(2, "GRL");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Grenada");
				ps.setString(2, "GRD");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Hong Kong");
				ps.setString(2, "HKG");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.setString(1, "Macau");
				ps.setString(2, "MAC");
				ps.setInt(3, 0);
				ps.setString(4, null);
				ps.addBatch();

				ps.executeBatch();

				this.conn.commit();

				this.conn.setAutoCommit(true);
				
		}
		catch(Exception ex) {
			System.err.println(ex.toString());
			ret = true;
		}
		finally {
			try {
				if(!stmt.isClosed())
					stmt.close();
			}
			catch(Exception ex) {
				System.err.println(ex.toString());
				ret = true;
			}
		}

		
		return ret;
	}
	
	private Boolean loadRegion() {
		boolean ret = false;
		String sql = null;
		Statement stmt = null;
		PreparedStatement ps = null;

		try {
			sql = "CREATE TABLE region ("
					+ " id INTEGER PRIMARY KEY AUTO_INCREMENT,"
					+ " country INTEGER	NOT NULL,"
					+ " region_name VARCHAR(255)"
					+ ")";
				stmt = this.conn.createStatement();
				stmt.execute(sql);
				stmt.close();
				this.conn.setAutoCommit(false);
				sql = "INSERT INTO region(country, region_name) VALUES(?,?)";
				ps = this.conn.prepareStatement(sql);

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Badakhshan");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Badghis");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Balkh");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Bamyan");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Daykundi");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Farah");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Faryab");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Ghazni");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Ghor");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Helmand");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Herat");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Jowzjan");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Kabul");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Kandahar");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Kapisa");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Khost");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Kunar");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Kunduz");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Laghman");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Logar");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Maidan Wardak");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Nangarhar");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Nimruz");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Nuristan");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Paktia");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Paktika");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Panjshir");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Parwan");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Samangan");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Sar-e Pol");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Takhar");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Urozgan");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='AFG' AND has_division = 1)");
				ps.setString(2, "Zabul");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='ALA' AND has_division = 1)");
				ps.setString(2, "Mariehamn");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='ALA' AND has_division = 1)");
				ps.setString(2, "Jomala");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='ALA' AND has_division = 1)");
				ps.setString(2, "Finström");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='ALA' AND has_division = 1)");
				ps.setString(2, "Lemland");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='ALA' AND has_division = 1)");
				ps.setString(2, "Saltvik");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='ALA' AND has_division = 1)");
				ps.setString(2, "Hammarland");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='ALA' AND has_division = 1)");
				ps.setString(2, "Sund");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='ALA' AND has_division = 1)");
				ps.setString(2, "Eckerö");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='ALA' AND has_division = 1)");
				ps.setString(2, "Föglö");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='ALA' AND has_division = 1)");
				ps.setString(2, "Brändö");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='ALA' AND has_division = 1)");
				ps.setString(2, "Geta");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='ALA' AND has_division = 1)");
				ps.setString(2, "Vårdö");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='ALA' AND has_division = 1)");
				ps.setString(2, "Lumparland");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='ALA' AND has_division = 1)");
				ps.setString(2, "Kumlinge");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='ALA' AND has_division = 1)");
				ps.setString(2, "Kökar");
				ps.addBatch();

				ps.setString(1, "(SELECT id FROM country WHERE country_code='ALA' AND has_division = 1)");
				ps.setString(2, "Sottunga");
				ps.addBatch();

				ps.executeBatch();

				this.conn.commit();

				this.conn.setAutoCommit(true);
				
				ret = false;			
		}
		catch(Exception ex) {
			System.err.println(ex.toString());
			ret = true;
		}
		finally {
			try {
				if(!stmt.isClosed())
					stmt.close();
			}
			catch(Exception ex) {
				System.err.println(ex.toString());
				ret = true;
			}
		}
		return ret;
	}
	
	private Boolean dbOpen() {
		boolean ret = false;

		Config conf = new Config();
		try {
			Class.forName(conf.getDatabaseDriver());
			this.conn = DriverManager.getConnection(conf.getDatabaseString(), conf.getDatabaseUser(), conf.getDatabasePassword());
		}
		catch(Exception ex) {
			System.err.println(ex.getMessage());
			ret = true;
		}

		return ret;
	}

	private boolean dbClose() {
    	boolean ret = false;
    	
    	try {
    		if(this.conn.isClosed() == false) {
    			this.conn.close();
    		}
    	}
    	catch(Exception ex) {
    		System.err.println(ex.toString());
    	}
    	
    	return ret;
	}

}
