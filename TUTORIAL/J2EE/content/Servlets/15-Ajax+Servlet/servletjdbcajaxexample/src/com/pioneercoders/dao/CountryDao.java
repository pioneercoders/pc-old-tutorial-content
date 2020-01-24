package com.pioneercoders.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pioneercoders.dbconnection.DBConnection;
import com.pioneercoders.dbconnection.QueryConstants;
import com.pioneercoders.model.Country;

public class CountryDao {
	
	public ArrayList<Country> getAllCountries() throws ClassNotFoundException, SQLException{
		
		
		  Connection con= DBConnection.getConnection();
		  ArrayList<Country> al= new ArrayList<Country>();
		  String query = QueryConstants.COUNTRY_SELECT;
		  PreparedStatement ps= con.prepareStatement(query);
		  ResultSet rs= ps.executeQuery();
		  while(rs.next()){
			  Country country= new Country();
			  country.setCode(rs.getString("CODE"));
			  country.setName(rs.getString("NAME"));
			  country.setContinent(rs.getString("CONTINENT"));
			  country.setRegion(rs.getString("REGION"));
			  country.setPopulation(rs.getInt("POPULATION"));
			  country.setCapital(rs.getString("CAPITAl"));
			  al.add(country);
		  }
		  
		  
		  
		return al;
		
		
	}

}
