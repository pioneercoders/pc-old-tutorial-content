package com.pioneercoders.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pioneercoders.entity.ContractEmployee;
import com.pioneercoders.util.HibernateUtil;

public class ContractEmployeeDao {
	public void insertContractEmployeeInfo(ContractEmployee contractemployee){
		Session ses = HibernateUtil.getSessionFactory().openSession();
		Transaction tx= ses.beginTransaction();
		ses.save(contractemployee);
		tx.commit();
		
	}


}
