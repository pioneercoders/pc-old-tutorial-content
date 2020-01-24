package com.pioneercoders.hibernate.ehcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.stat.Statistics;

public class HibernateEHCacheMain {

	public static void main(String[] args) {
		
		System.out.println("Temp Dir:"+System.getProperty("java.io.tmpdir"));
		
		insertCountry("India");
		insertCountry("aut");
		insertCountry("newz");
		insertCountry("pack");
		insertCountry("indo");
		
		//Initialize Sessions
		SessionFactory sessionFactory = HibenateUtils.getSessionFactory();
		Statistics stats = sessionFactory.getStatistics();
		System.out.println("Stats enabled="+stats.isStatisticsEnabled());
		stats.setStatisticsEnabled(true);
		System.out.println("Stats enabled="+stats.isStatisticsEnabled());
		
		Session session = sessionFactory.openSession();
		Session otherSession = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Transaction otherTransaction = otherSession.beginTransaction();
		
		printStats(stats, 0);
		
		Country emp = (Country) session.load(Country.class, 1L);
		printData(emp, stats, 1);
		
		emp = (Country) session.load(Country.class, 1L);
		printData(emp, stats, 2);
		
		//clear first level cache, so that second level cache is used
		session.evict(emp);
		emp = (Country) session.load(Country.class, 1L);
		printData(emp, stats, 3);
		
		emp = (Country) session.load(Country.class, 3L);
		printData(emp, stats, 4);
		
		emp = (Country) otherSession.load(Country.class, 1L);
		printData(emp, stats, 5);
		
		//Release resources
		transaction.commit();
		otherTransaction.commit();
		sessionFactory.close();
	}

	
	public static void insertCountry(String countryName) {

		// construct employee entity
		Country country = new Country();
		country.setName(countryName);

		SessionFactory  sessionFactory = HibenateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.save(country);
		// commit the changes to db.
		transaction.commit();

		System.out.println("----------- country created successfully in DB ------------------------");
	}
	
	private static void printStats(Statistics stats, int i) {
		System.out.println("***** " + i + " *****");
		System.out.println("Fetch Count="
				+ stats.getEntityFetchCount());
		System.out.println("Second Level Hit Count="
				+ stats.getSecondLevelCacheHitCount());
		System.out
				.println("Second Level Miss Count="
						+ stats
								.getSecondLevelCacheMissCount());
		System.out.println("Second Level Put Count="
				+ stats.getSecondLevelCachePutCount());
	}

	private static void printData(Country emp, Statistics stats, int count) {
		System.out.println(count+":: Name="+emp.getName());
		printStats(stats, count);
	}

}
