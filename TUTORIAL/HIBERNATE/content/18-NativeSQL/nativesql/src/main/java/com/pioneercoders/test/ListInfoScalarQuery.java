package com.pioneercoders.test;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pioneercoders.util.HibernateUtil;

public class ListInfoScalarQuery {

	public static void main(String[] args) {
		Session ses = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = ses.beginTransaction();

		String sqlquery = "select course_name,course_fee,course_duration  from course_mst_tbl";

		SQLQuery query = ses.createSQLQuery(sqlquery);
		query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);// im iterating
																	// based on
																	// map
		List courses = query.list();

		for (Object course : courses) {
			Map row = (Map) course;// it will map the row after getting course
			System.out.println("Details are " + "   " + row.get("course_name")
					+ "   " + row.get("course_fee") + "   "
					+ row.get("course_duration"));

		}

		tx.commit();
		ses.close();

		/*
		 * Hibernate: select course_name, course_fee, course_duration from
		 * course_mst_tbl 
		 * Details are corejava 2000.0 four 
		 * Details are advjava 1000.0 one 
		 * 
		 * Details are hibernate 1500.0 three 
		 * Details are spring 1500.0 four 
		 * 
		 * Details are corejava 1000.0 three
		 */

	}
}
