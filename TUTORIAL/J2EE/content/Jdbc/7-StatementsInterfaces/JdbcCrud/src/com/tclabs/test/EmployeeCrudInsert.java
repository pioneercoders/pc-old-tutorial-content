package com.tclabs.test;

import java.sql.SQLException;

import com.jdbc.dao.EmployeeDao;

public class EmployeeCrudInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		  EmployeeDao edao = new EmployeeDao();
		  int inserted =edao.insertEmpInfo(40, "rajesh", "20-06-1993", "2345@gamil.com", 777478512);
	  if(inserted>0){
		  System.out.println(inserted);
		  
	  }
	}
	

}
