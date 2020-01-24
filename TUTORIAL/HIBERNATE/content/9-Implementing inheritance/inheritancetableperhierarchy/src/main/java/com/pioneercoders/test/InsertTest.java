package com.pioneercoders.test;

import com.pioneercoders.dao.ContractEmployeeDao;
import com.pioneercoders.dao.EmployeeDao;
import com.pioneercoders.dao.RegularEmployeeDao;
import com.pioneercoders.entity.Contract_Employee;
import com.pioneercoders.entity.Employee;
import com.pioneercoders.entity.Regular_Employee;

public class InsertTest {
	public static void main(String[] args) {
		EmployeeDao edao = new EmployeeDao();
		ContractEmployeeDao cdao = new ContractEmployeeDao();
		RegularEmployeeDao rdao = new RegularEmployeeDao();
		Employee emp = new Employee();
		emp.setEmpName("Rajesh");
		Contract_Employee cemployee = new Contract_Employee();
		cemployee.setContract_duration("six months");
		cemployee.setEmpName("Kulkarni");
		cemployee.setPay_per_hour(500.0f);
		Regular_Employee regemployee = new Regular_Employee();
		regemployee.setBonus(5000);
		regemployee.setEmpName("durga");
		regemployee.setSalary(25000.0f);

		edao.insertEmployeeInfo(emp);
		cdao.insertContractEmployeeInfo(cemployee);
		rdao.insertRegularEmployeeInfo(regemployee);

		/*
		 * Note: After Running this test class u will find three insert queries
		 * 
		 * Hibernate: insert into employee_mst_tbl (EMP_NAME, EMPLOYEE_TYPE)
		 * values (?, 'employee') //id is automatically generated ,employee is
		 * discriminator value
		 * 
		 * Hibernate: insert into employee_mst_tbl (EMP_NAME, CONTRACT_DURATION,
		 * PAY_PER_HOUR, EMPLOYEE_TYPE) values (?, ?, ?, 'contractemployee')
		 * contractemployee is discriminator value
		 * 
		 * 
		 * Hibernate: insert into employee_mst_tbl (EMP_NAME, BONUS, SALARY,
		 * EMPLOYEE_TYPE) values (?, ?, ?, 'regularemployee') regularemployee is
		 * discriminator value
		 */

	}

}
