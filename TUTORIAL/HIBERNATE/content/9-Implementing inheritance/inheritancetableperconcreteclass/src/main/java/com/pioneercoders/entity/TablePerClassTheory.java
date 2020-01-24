package com.pioneercoders.entity;

public class TablePerClassTheory {
	/*
	 * In this strategy we will create tables per each class
	 * 
	 * employee -- >employee table contractemployee -->contractemployee table
	 * regular table--> regularemployee table
	 * 
	 * to inherit parent class(Employee) variables in sub class
	 * (ContractEmployee,RegularEmployee) we will
	 * 
	 * use @AttribiuteOverrides annotation and override those variables as
	 * mentioned below
	 * 
	 * @AttributeOverrides({
	 * 
	 * @AttributeOverride(name="EMPLOYEE_ID",
	 * column=@Column(name="employeeid")),
	 * 
	 * @AttributeOverride(name="EMPLOYEE_NAME",
	 * column=@Column(name="employeename")) })
	 * 
	 * in this no need of discriminator column ,because we storing data
	 * different tables
	 * 
	 * Note :In this approach we will find some benefits and drawbacks some of
	 * them are
	 * 
	 * Advantage:
	 * 
	 * Possible to define NOT NULL constraints on the table.
	 * Slightly Normalized  (data is separating in  three tables )
	 * 
	 * Disadvantage
	 * 
	 * Duplicate columns are created in the subclass tables.
	 * 
	 */

}
