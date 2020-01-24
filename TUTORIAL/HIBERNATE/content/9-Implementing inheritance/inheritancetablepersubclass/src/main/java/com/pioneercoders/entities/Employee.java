package com.pioneercoders.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity  
@Table(name = "employee_mst_tbl")  
@Inheritance(strategy=InheritanceType.JOINED)  
  
public class Employee {  
@Id  

@GeneratedValue(strategy=GenerationType.AUTO)  
      
@Column(name = "EMPLOYEE_ID")  
private int employeeid;  
  
@Column(name = "EMPLOYEE_NAME")  
private String employeename;

public int getEmployeeid() {
	return employeeid;
}

public void setEmployeeid(int employeeid) {
	this.employeeid = employeeid;
}

public String getEmployeename() {
	return employeename;
}

public void setEmployeename(String employeename) {
	this.employeename = employeename;
}  

}