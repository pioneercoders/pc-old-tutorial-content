package com.pioneercoders.test;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pioneercoders.model.Course;
import com.pioneercoders.util.HibernateUtil;

public class ListInfoEntityQuery {
	public static void main(String[] args) {
		Session ses = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = ses.beginTransaction();

		// in this we are selecting data from db using native sql queries

		// write the sql query to get data from db
		String nativesql = "select * from course_mst_tbl";
		SQLQuery query = ses.createSQLQuery(nativesql);

		// after writing sql in hibernate we are only dealing with objects
		// mention which is the Entity class for equivalent course_mst_tbl

		query.addEntity(Course.class);

		List<Course> courses = query.list();
		for (Course course : courses) {
			System.out.println("Course details are " + "   "
					+ course.getCourseduration() + "  " + course.getCoursefee()
					+ "  " + course.getCoursename());
		}
		/*
		 * Hibernate: select
		 * 
		 * from course_mst_tbl 
		 * Course details are four 2000.0 corejava 
		 * Course details are one 1000.0 advjava 
		 * 
		 * Course details are three 1500.0  hibernate 
		 * Course details are four 1500.0 spring 
		 * Course details are three 1000.0 corejava
		 * 
		 */

		tx.commit();
		
		 ses.close();
	}

}
