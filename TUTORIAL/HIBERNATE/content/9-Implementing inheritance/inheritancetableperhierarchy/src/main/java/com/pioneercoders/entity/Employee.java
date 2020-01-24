package com.pioneercoders.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="employee_mst_tbl")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)//singletable strategy 
@DiscriminatorColumn(name="EMPLOYEE_TYPE", 
  discriminatorType=DiscriminatorType.STRING)//to show details of particular class 
@DiscriminatorValue(value="employee")
public class Employee  {
	@Id
	@Column(name="EMP_ID")
	@GeneratedValue
	private int empId;
	@Column(name="EMP_NAME")
	private String empName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	

}
