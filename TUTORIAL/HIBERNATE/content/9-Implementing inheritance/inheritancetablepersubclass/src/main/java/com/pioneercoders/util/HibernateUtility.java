package com.pioneercoders.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	public SessionFactory sFactory =null;
	public static SessionFactory getSessionFactory(){
		Configuration cfg = new Configuration().configure();
		
		SessionFactory sFactory = cfg.buildSessionFactory();
		return sFactory;
		
	}
	

}
