package com.labs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.labs.dbconnection.DBConnection;
import com.labs.dbconnection.QueryConstants;

public class EmployeeDao {
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

}
