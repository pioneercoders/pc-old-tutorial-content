package com.pioneercoders.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pioneercoders.entities.RegularEmployee;
import com.pioneercoders.util.HibernateUtility;

public class RegularEmployeeDao {
	public void insertRegularEmployeeInfo(RegularEmployee regularemployee){
Session ses = HibernateUtility.getSessionFactory().openSession();
	
	Transaction tx= ses.beginTransaction();
	
	ses.save(regularemployee);
	tx.commit();
	
	}
} 
