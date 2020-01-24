package com.pioneercoders.resultsetmetadataex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSetMetaDataEx {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//by using resultset we are getting only data but we 
		//dont know tables information  like columns and no of columns to know table full details 
		//we have to use ResultSetMetaData metadata means information about resultset like column details 
		//in this i want to know user_mst_tbl
		//i want to know number of columns, column name of particular index,column name datatype we have to use the 
		//following methods 
		/*
		 * Method	                                            Description
       public int getColumnCount()throws SQLException	     it returns the total number of columns in the ResultSet object.
     public String getColumnName(int index)throws SQLException	  it returns the column name of the specified column index.
 public String getColumnTypeName(int index)throws SQLException	 it returns the column type name for the specified index.
 
		 */
		
		Class.forName("com.mysql.jdbc.Driver");  
		 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/med_hosp_db_2", "root", "root");
		 PreparedStatement pstmt= con.prepareStatement("select * from user_mst_tbl");
		 //first get the ResultSet data
		 ResultSet rs= pstmt.executeQuery();
		 while(rs.next()){//it iterates row  one by one by moving cursor forward
			 
		 }
		 //but i want to the know datatypes and columns of the user table 
		 //to get metadata of the user table we have to use ResultsetMetaData
		   //to get metadata we have to call getMetaData()
		   ResultSetMetaData rd= rs.getMetaData();
		   //i want to know no of columns 
		   System.out.println("No of Columns "+"  "+rd.getColumnCount());
		  //i want to first column name
		   System.out.println("First Column Name"+"  "+rd.getColumnName(1));
		   //i want to know the data type of firstcolumn 
		   System.out.println("First Column name DataType"+" "+rd.getColumnTypeName(1));
		  
		  
		
	}

}
