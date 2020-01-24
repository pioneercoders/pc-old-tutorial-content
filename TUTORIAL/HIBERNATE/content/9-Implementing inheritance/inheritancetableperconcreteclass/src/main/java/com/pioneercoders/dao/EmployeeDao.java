package com.pioneercoders.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pioneercoders.entity.Employee;
import com.pioneercoders.util.HibernateUtil;

public class EmployeeDao {
	public void insertEmployeeInfo(Employee employee){
		Session ses = HibernateUtil.getSessionFactory().openSession();
		Transaction tx= ses.beginTransaction();
		ses.save(employee);
		tx.commit();
		
	}

}
