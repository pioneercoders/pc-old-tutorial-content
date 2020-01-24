package com.pioneercoders.rowsetex;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetEx {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*
		 * 
		 * JDBC RowSet

       The instance of RowSet is the java bean component because it has properties and java bean notification mechanism. It is introduced since JDK 5.

     It is the wrapper of ResultSet. It holds tabular data like ResultSet but it is easy and flexible to use.

     The implementation classes of RowSet interface are as follows:

       JdbcRowSet
       CachedRowSet
       WebRowSet
       JoinRowSet
       FilteredRowSet
		 */
		//by using rowset only  we are setting database properties 
		//because internally rowset uses properties file to set the data
		//it is easy to switch and flexible to use 
		//if we set database details to rowset we can switch to another database easily 
		//let see how to set db details to rowset 
		//load the driver 
		Class.forName("com.mysql.jdbc.Driver"); 
		 //Creating and Executing RowSet  
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();  
        rowSet.setUrl("jdbc:mysql://localhost:3306/med_hosp_db_2");  
        rowSet.setUsername("root");  
        rowSet.setPassword("root");  
                   
        rowSet.setCommand("select * from user_mst_tbl");  
        rowSet.execute();  
                   
    while (rowSet.next()) {  
                        // Generating cursor Moved event  
                        System.out.println("Id: " + rowSet.getInt(1));  
                        System.out.println("UserName: " + rowSet.getString(2)); 
                        System.out.println("Userpwd " + rowSet.getString(3));

                        System.out.println("Roleid " + rowSet.getString(4));
                        
                }  
                 
		
	}

}
