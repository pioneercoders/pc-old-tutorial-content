package com.pioneercoders.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pioneercoders.entities.Employee;
import com.pioneercoders.util.HibernateUtility;

public class EmployeeDao {
public void insertEmployeeInfo(Employee employee){
	Session ses = HibernateUtility.getSessionFactory().openSession();
	
	Transaction tx= ses.beginTransaction();
	
	ses.save(employee);
	tx.commit();
	
}

}
