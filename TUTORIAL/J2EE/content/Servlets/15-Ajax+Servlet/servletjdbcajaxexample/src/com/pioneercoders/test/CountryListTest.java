package com.pioneercoders.test;

import java.sql.SQLException;
import java.util.ArrayList;

import com.pioneercoders.dao.CountryDao;
import com.pioneercoders.model.Country;

public class CountryListTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		 
		CountryDao cdao = new CountryDao();
		ArrayList<Country> al= cdao.getAllCountries();
		if(al!=null){
			System.out.println(al);
		}
		
		
		
		
	}

}
