package com.pioneercoders.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pioneercoders.entity.RegularEmployee;
import com.pioneercoders.util.HibernateUtil;

public class RegularEmployeeDao {
	public void insertRegularEmployeeInfo(RegularEmployee regularemployee){
		Session ses = HibernateUtil.getSessionFactory().openSession();
		Transaction tx= ses.beginTransaction();
		ses.save(regularemployee);
		tx.commit();
		
	}


}
