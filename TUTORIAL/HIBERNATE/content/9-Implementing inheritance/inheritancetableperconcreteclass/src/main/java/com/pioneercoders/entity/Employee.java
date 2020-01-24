package com.pioneercoders.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity  
@Table(name = "employee_tbl")  
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)  
  

public class Employee {
	@Id
	
	@Column(name="EMPLOYEE_ID")
	private int empid;
	@Column(name="EMPLOYEE_NAME")
	private String empname;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	
	

}
