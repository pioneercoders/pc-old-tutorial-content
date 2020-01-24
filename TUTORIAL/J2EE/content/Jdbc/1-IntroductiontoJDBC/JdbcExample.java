package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcExample {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	  /*
	   *    Register the driver class
            Creating connection
            Creating statement/PreparedStatement
            Executing queries 
            Closing connection
	   */
		Class.forName("com.mysql.jdbc.Driver");//Driver for mysql 
		//The forName() method of Class class is used to register the driver class. This method is used to dynamically load the driver class.
		//  localhost is mysql server IP address if it is running in our local machine we have to use 
		//Localhost if it is running server machine we have to use 
		//IP address ex:192.168.100.88  
		//3306 is mysql port number
		//med_hosp_db_2 is database schema name 
		//root  to connect with database we use username
		//root  to connect with database we use password
          Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/med_hosp_db_2", "root", "root");
	  //by using DriverManager we are getting database connection 
          //after getting Connection to perform crud(create,read,update,delete operations on database we will use statements or preparedstatements
          
          //by writing statements  the changes directly applied on database 
          //how to insert data into table using prepared statement 
            String sql="insert into user_mst_tbl(id,user_id,user_pwd,role_id) values (?,?,?,?)";
           PreparedStatement pstmt= con.prepareStatement(sql);
           //we are passing values  based on datatype
           pstmt.setInt(1, 72);//index position
           pstmt.setString(2, "krish");
           pstmt.setString(3, "abc");
           pstmt.setInt(4, 6);
           
           //tyeps of queries 
          // 1.select queries
           //2.Non Select queries(insert,update,delete) 
           //for select queries we have to use executeQuery() returntype  resultset
           //for non select queries we  have to use executeupdate() return type int 
           //non select we are applying changes on db after changes applied on db we have to know the changes applied are not thats why return type is int
           int inserted= pstmt.executeUpdate();
           System.out.println(inserted);
           
           
	}

}
