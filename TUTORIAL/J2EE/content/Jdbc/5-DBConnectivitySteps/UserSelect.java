package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserSelect {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//load the jdbc driver
		Class.forName("com.mysql.jdbc.Driver");
		//Create the jdbc Connection 
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/med_hosp_db_2", "root", "root");
		// create the statement or preparedstatement to execute sql queries 
		Statement st= conn.createStatement();
		//in this we selecting data from database we have to use executeQuery()
//method we are not doing any changes on db just we are selecting data
		ResultSet rs= st.executeQuery("select * from user_mst_tbl");
		//in db table will have more data we have to iterate to get the data it points one by one by placing cursor
		while(rs.next()){
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getInt(4));
			// we get the data based on index values one column value is one index in usertable will have four values index positions are four 
		}
		}
}
