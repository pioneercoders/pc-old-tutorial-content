package com.tclabs.connection;

public class QueryConstants {
	public static final String EMPLOYEE_SELECT = "select * from employee_mst_tbl";
	public static final String EMPLOYEE_SELECT1 = "select id,emp_name,dob,mail_id,phoneno from employee_mst_tbl where id=?";
	public static final String EMPLOYEE_INSERT = "insert into employee_mst_tbl(id,emp_name,dob,mail_id,phoneno) values(?,?,?,?,?)";
	public static final String EMPLOYEE_UPDATE = "update employee_mst_tbl set emp_name=? where id=?";
	public static final String EMPLOYEE_DELETE = "delete from employee_mst_tbl where id=?";

}
