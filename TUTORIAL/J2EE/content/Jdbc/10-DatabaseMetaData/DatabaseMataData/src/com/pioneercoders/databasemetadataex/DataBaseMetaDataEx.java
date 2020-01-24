package com.pioneercoders.databasemetadataex;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseMetaDataEx {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	
	//to communicate with database we have to know 
	//its driver and port and Ip address and username and password
	//but if we want to know additional information like database vendor
	//database version and vendor details 
	//we  have to use DataBaseMetaData
		Class.forName("com.mysql.jdbc.Driver");  
		 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/med_hosp_db_2", "root", "root");
		 DatabaseMetaData dbmd=con.getMetaData();  
		  
		 System.out.println("Driver Name: "+dbmd.getDriverName());  
		 System.out.println("Driver Version: "+dbmd.getDriverVersion());  
		 System.out.println("UserName: "+dbmd.getUserName());  
		 System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
		 System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
		 
		 con.close();  
	}
	
}
