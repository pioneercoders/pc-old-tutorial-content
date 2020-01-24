package com.pioneercoders.test;

import com.pioneercoders.dao.ContractEmployeeDao;
import com.pioneercoders.dao.EmployeeDao;
import com.pioneercoders.dao.RegularEmployeeDao;
import com.pioneercoders.entities.ContractEmployee;
import com.pioneercoders.entities.Employee;
import com.pioneercoders.entities.RegularEmployee;

public class InsertInformationTest {
	public static void main(String[] args) {
		EmployeeDao edao = new EmployeeDao();
		ContractEmployeeDao cdao = new ContractEmployeeDao();
		RegularEmployeeDao rdao = new RegularEmployeeDao();

		Employee emp = new Employee();

		emp.setEmployeename("anilll");

		ContractEmployee cemployee = new ContractEmployee();
		cemployee.setContract_duration("one year");

		cemployee.setPay_per_hour(300);

		RegularEmployee regemployee = new RegularEmployee();
		regemployee.setBonus(2000);

		regemployee.setSalary(20000.0f);

		// call the dao and set data to it

		edao.insertEmployeeInfo(emp);

		cdao.insertContractEmployeeInfo(cemployee);

		rdao.insertRegularEmployeeInfo(regemployee);

		System.out.println("successs");

		/*
		 * Note: if we run this it generate the query as
		 * 
		 * Hibernate: insert into employee_mst_tbl (EMPLOYEE_NAME) values (?)
		 * 
		 * 
		 * Hibernate: insert into employee_mst_tbl (EMPLOYEE_NAME) values (?)
		 * Hibernate: insert into contractemployee_sub_tbl (CONTRACT_DURATION,
		 * PAY_PER_HOUR, ID) values (?, ?, ?)
		 * 
		 * 
		 * Hibernate: insert into employee_mst_tbl (EMPLOYEE_NAME) values (?)
		 * Hibernate: insert into regularemployee_sub_tbl (BONUS, SALARY, ID)
		 * values (?, ?, ?)
		 */

	}

}
