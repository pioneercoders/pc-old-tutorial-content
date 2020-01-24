package com.pioneercoders.resultsetexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetExample {

	/*
	 * If we want to select the data from database ,jdbc provides ResultSet
	 * Interface to select data from database and return the data in resultset
	 * format
	 * 
	 * The SELECT statement is the standard way to select rows from a database
	 * and view them in a result set. The java.sql.ResultSet interface
	 * represents the result set of a database query.
	 * 
	 * ResultSet object maintains a cursor that points to the current row in the
	 * result set. The term "result set" refers to the row and column data
	 * contained in a ResultSet object.
	 */
	public static void main(String[] args) throws SQLException,
			ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/jdbc", "root", "root");
		String selectquery = "select * from employee_mst_tbl";
		PreparedStatement pstmt = con.prepareStatement(selectquery);
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {// it will checks one by one
			/*
			 * mention the datatypes matches with the database in sql in Java
			 * varchar String number(in sql) /int(in mysql) int
			 * 
			 * in resultset we can mention index numbers or column names
			 * rs.getInt(1) or rs.getInt(id)
			 */
			System.out.println("Details are " + "    " + rs.getInt(1));// it will  returns first column value 
			// 
			// 
																		
			System.out.println("Detials are " + "  " + rs.getString(2) + " "
					+ rs.getString(3) + "   " + rs.getString(4) + " "
					+ rs.getInt(5));
          
			
			/* it will give the result as follows 
			 * 
			 * Details are     20
			Detials are   gopi 20-02-1993   gopi@gmail.com 8754126
			Details are     22
			Detials are   rajeshh 10-06-1993   2345@gmail.com 8542167
			Details are     30
			Detials are   anand 12-01-1993   appaji@gmail.com 7451426
			Details are     40
			Detials are   rajesh 20-06-1993   2345@gamil.com 777478512

			*/
		}

	}
}
