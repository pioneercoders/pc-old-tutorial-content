package com.tclabs.test;

import java.sql.SQLException;

import com.jdbc.dao.EmployeeDao;

public class EmployeeCrudUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EmployeeDao edao = new EmployeeDao();
		int updated = edao.updateEmpInfo("sri", 10);
		if(updated>0){
			System.out.println(updated);
		}
	}
}
