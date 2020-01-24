package com.tclabs.test;

import java.sql.SQLException;

import com.jdbc.dao.EmployeeDao;

public class EmployeeCrudDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EmployeeDao edao = new EmployeeDao();
		int deleted = edao.deleteEmpInfo(10);
		if(deleted>0){
			System.out.println(deleted);
		}
		
	}

}
