package com.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.jdbc.model.Employee;
import com.tclabs.connection.DBConnection;
import com.tclabs.connection.QueryConstants;

public class EmployeeDao {
	//All database operations we write separately in Daos 
	public Employee getEmployeeDataById(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Employee emp= null;
		Connection con1=DBConnection.getConnection();
		String query=QueryConstants.EMPLOYEE_SELECT1;
		PreparedStatement pstmt=con1.prepareStatement(query);
		pstmt.setInt(1, id);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()){
		 emp = new Employee();
			emp.setId(rs.getInt(1));
			emp.setEmpname(rs.getString(2));
			emp.setDob(rs.getString(3));
			emp.setEmailid(rs.getString(4));
			emp.setPhoneno(rs.getInt(5));
		}
		return emp;
	}

	public int insertEmpInfo(int id, String empname, String dob, String mailid,
			int phoneno) throws ClassNotFoundException, SQLException {
		int rowsmodified=0;
		Connection con=DBConnection.getConnection();
		String query=QueryConstants.EMPLOYEE_INSERT;
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setInt(1, id);
		pstmt.setString(2, empname);
		pstmt.setString(3, dob);
		pstmt.setString(4, mailid);
		pstmt.setInt(5, phoneno);
		rowsmodified=pstmt.executeUpdate();
		return rowsmodified;
	}
	
	  /*
	   * 
	   *   For Dml operations(insert,update,delete) we will use  executeUpdate() method or for non-select queries (insert,update,delete) we will use  executeUpdate() method 
	   *   
	   *   and executeUpdate return type is int 
	   *   
	   *   if any changes effected on the database like insert,update,delete executeUpdate()  method will return integer values 
	   *   if value is inserted in db we will get value as 'one' similarly for update and delete also 
	   *   
	   * 
	   */

	public int updateEmpInfo(String empname, int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int rowsupdated=0;
		Connection con= DBConnection.getConnection();
		String query = QueryConstants.EMPLOYEE_UPDATE;
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setString(1, empname);
		pstmt.setInt(2, id);
		rowsupdated=pstmt.executeUpdate();
		
		
		return rowsupdated;
	}

	public int deleteEmpInfo(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int rowsdeleted=0;
		Connection con1=DBConnection.getConnection();
		String query=QueryConstants.EMPLOYEE_DELETE;
		PreparedStatement pstmt=con1.prepareStatement(query);
		pstmt.setInt(1, id);
		rowsdeleted=pstmt.executeUpdate();
		return rowsdeleted;
	}

	public ArrayList<Employee> getAllEmployees() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=DBConnection.getConnection();
		ArrayList<Employee> al= new ArrayList<Employee>();
		String query=QueryConstants.EMPLOYEE_SELECT;
		PreparedStatement pstmt=con.prepareStatement(query);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()){
			Employee emp = new Employee();
			emp.setId(rs.getInt(1));
			emp.setEmpname(rs.getString(2));
			emp.setDob(rs.getString(3));
			emp.setEmailid(rs.getString(4));
			emp.setPhoneno(rs.getInt(5));
			al.add(emp);
		}
		return al;
	}
	
	

}
