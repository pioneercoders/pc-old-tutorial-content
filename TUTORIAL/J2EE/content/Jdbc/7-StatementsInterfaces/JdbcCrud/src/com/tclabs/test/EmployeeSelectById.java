package com.tclabs.test;

import java.sql.SQLException;

import com.jdbc.dao.EmployeeDao;
import com.jdbc.model.Employee;

public class EmployeeSelectById {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EmployeeDao edao = new EmployeeDao();
		Employee emp = edao.getEmployeeDataById(20);
		if(emp!=null){
			System.out.println(emp);
		}
	}

}
