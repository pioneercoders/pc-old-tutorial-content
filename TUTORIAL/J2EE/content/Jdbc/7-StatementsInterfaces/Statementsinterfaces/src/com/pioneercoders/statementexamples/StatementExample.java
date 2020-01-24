package com.pioneercoders.statementexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {
	
	/*
	 * To perform crud operations on database we will statements and prepared statements in this we are using statement how to insert values in db 
	 * 
	 *  First create the table in database 
	 *  
	 *   CREATE TABLE  `jdbc`.`user_mst_tbl` (
         `ID` bigint(20) NOT NULL AUTO_INCREMENT,
         `USER_ID` varchar(255) DEFAULT NULL,
         `USER_PWD` varchar(255) DEFAULT NULL,
         `ROLE_ID` bigint(20) DEFAULT NULL,
          PRIMARY KEY (`ID`));
	 *  
	 *   for any jdbc application  these steps are common 
	 *   
	 *    Register the driver class of particular vendor (i'm using mysql driver )
            Creating connection (to establish connection with database 
            Creating statement/PreparedStatement to perform crud operations (select,insert,delete,update)
            Executing queries  for select use execute() method for non-select (insert,update,delete)queries use executeUpdate() method 
            Closing connection
	 *   
	 *  
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	
	
	Class.forName("com.mysql.jdbc.Driver");//Driver for mysql 
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
	//by using  statement i'm inserting data into database 
	Statement st = con.createStatement();
	 String sql= "insert into user_mst_tbl(id,user_id,user_pwd,role_id) values(1,'sr12','sr',3)";
	 // i'm inserting one row into the database executeUpdate() return type is int if data is inserted in db it will return value 'one'  
	 
	 int inserted = st.executeUpdate(sql);
	 if(inserted>0){
		 System.out.println("Successfully Inserted"+" "+inserted);
	 }
	 con.close();
	
	

}
}
