package com.pioneercoders.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pioneercoders.entity.Regular_Employee;
import com.pioneercoders.util.HibernateUtil;

public class RegularEmployeeDao {
	public void insertRegularEmployeeInfo(Regular_Employee regularemployee){
		Session ses = HibernateUtil.getSessionFactory().openSession();
		Transaction tx= ses.beginTransaction();
		ses.save(regularemployee);
		tx.commit();
		
	}

}
