package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessingEx {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//if we want to insert into db we want to write statement or prepared statement 
		//When multiple inserts are to be made to the table in a database, the trivial way is to execute a query per record.
		//However, this involves acquiring and releasing connection every time a record is inserted, which hampers application performance.
		//We overcome, this(acquiring and releasing connection every-time) by making use of Batch operations in JDBC.
		//We set the parameters in the java.sql.PreparedStatement and it to the batch using PreparedStatement.addBatch() method. 
		//Then when the batch size reaches a desired threshold, we execute the batch using PreparedStatement.executeBatch() method.
		 //another way to improve the performance is ConnectionPooling
		//first of all set the autocommit false because one insert doesnt effect on another query 
		//However, when executing Queries in Batch, it is sometimes important to maintain the atomicity of the database. This can be a problem if one the commands in the batch throws some error since the commands after the exception will not be executed leaving the database in an inconsistent state. So we set the auto-commit to false and if all the records are executed successfully, we commit the transaction.
		
		//This maintains the integrity of the the database.
		  Class.forName("com.mysql.jdbc.Driver");
		
		  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/med_hosp_db_2", "root", "root");
		con.setAutoCommit(false);
		  Statement st= con.createStatement();
		st.addBatch("insert into user_mst_tbl(id,user_id,user_pwd,role_id)values(1023,'vamsi','bcd',6)");
		st.addBatch("update user_mst_tbl set user_id='vamsi' where user_pwd='bcd'");
		st.addBatch("delete from user_mst_tbl where user_pwd='bc'");
		//st.addBatch("select * from role_mst_tbl");
		//we cannot apply batch for select statements st.addBatch("select * from user_mst_tbl");because it internally executes executeupdate method only
		//Exception in thread "main" java.sql.BatchUpdateException: Can not issue SELECT via executeUpdate().
		//at com.mysql.jdbc.Statement.executeBatch(Statement.java:961)
		//at com.jdbc.Batch.dataBatch(Batch.java:16)
		//at com.jdbc.TestBatch.main(TestBatch.java:8)

		int k[]=st.executeBatch();
		System.out.println(k.length);
		con.commit();

	}

}
