package com.pioneercoders.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pioneercoders.entities.ContractEmployee;
import com.pioneercoders.util.HibernateUtility;

public class ContractEmployeeDao {
	public void insertContractEmployeeInfo(ContractEmployee contractemployee){
		Session ses = HibernateUtility.getSessionFactory().openSession();
			
			Transaction tx= ses.beginTransaction();
			
			ses.save(contractemployee);
			tx.commit();
			
			}
}
