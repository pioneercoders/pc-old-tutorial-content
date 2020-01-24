package com.pioneercoders.test;

import com.pioneercoders.dao.ContractEmployeeDao;
import com.pioneercoders.dao.EmployeeDao;
import com.pioneercoders.dao.RegularEmployeeDao;
import com.pioneercoders.entity.ContractEmployee;
import com.pioneercoders.entity.Employee;
import com.pioneercoders.entity.RegularEmployee;

public class InsertInfoTest {
	public static void main(String[] args) {
		EmployeeDao edao = new EmployeeDao();
		ContractEmployeeDao cdao = new ContractEmployeeDao();
		RegularEmployeeDao rdao = new RegularEmployeeDao();
		Employee emp = new Employee();
		emp.setEmpid(12);
		emp.setEmpname("rajesh");
		ContractEmployee cemployee = new ContractEmployee();
		cemployee.setEmpid(20);
		cemployee.setEmpname("shivanarayan");
		cemployee.setPay_per_hour(1000.0f);
		cemployee.setContract_duration("one year");
		RegularEmployee regemployee = new RegularEmployee();
		regemployee.setEmpid(33);
		regemployee.setEmpname("sunil");
		regemployee.setBonus(3000);
		regemployee.setSalary(20000.0f);
		edao.insertEmployeeInfo(emp);
		cdao.insertContractEmployeeInfo(cemployee);
		rdao.insertRegularEmployeeInfo(regemployee);

		System.out.println("success");

		/*
		 * Atter running this class it generates queries as
		 * 
		 * Hibernate: insert into employee_tbl (EMPLOYEE_NAME, EMPLOYEE_ID)
		 * values (?, ?)
		 * 
		 * Hibernate: insert into contractemployee (EMPLOYEE_NAME,
		 * CONTRACT_DURATION, PAY_PER_HOUR, EMPLOYEE_ID) values (?, ?, ?, ?)
		 * 
		 * 
		 * Hibernate: insert into regularemployee (EMPLOYEE_NAME, BONUS, SALARY,
		 * EMPLOYEE_ID) values (?, ?, ?, ?)
		 */

	}

}
