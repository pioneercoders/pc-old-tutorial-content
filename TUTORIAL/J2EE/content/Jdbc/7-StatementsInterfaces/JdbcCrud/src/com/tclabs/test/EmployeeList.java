package com.tclabs.test;

import java.sql.SQLException;
import java.util.ArrayList;

import com.jdbc.dao.EmployeeDao;
import com.jdbc.model.Employee;

public class EmployeeList {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EmployeeDao edi= new EmployeeDao();
		 ArrayList<Employee> alist=	edi.getAllEmployees();
		 if(alist!=null){
			 System.out.println(alist);
	}
	}
}
