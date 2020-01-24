package com.pioneercoders.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pioneercoders.model.Course;
import com.pioneercoders.util.HibernateUtil;

public class InfoUsingNamedQuery {
	public static void main(String[] args) {
		Session ses = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = ses.beginTransaction();

		// to get named queries where we mentioned in entity class call
		// getNamedQuery()
		Query query = ses.getNamedQuery("findCourseByName");
		// pass the value to query

		query.setString("coursename", "corejava");
		List<Course> li = query.list();
		System.out.println(li);
		// getting information of courses based on courseduration

		Query namedquery = ses.getNamedQuery("findCourseNameByDuration");
		namedquery.setString("courseduration", "three");
		List<Course> coursesbasedonduration = namedquery.list();
		System.out.println(coursesbasedonduration);

		/*
		 * the queries generated are
		 * 
		 * findCourseByName
		 * 
		 * Hibernate: select course0_.COURSE_ID as COURSE_I1_0_,
		 * course0_.COURSE_DURATION as COURSE_D2_0_, course0_.COURSE_FEE as
		 * COURSE_F3_0_, course0_.COURSE_NAME as COURSE_N4_0_ from
		 * course_mst_tbl course0_ where course0_.COURSE_NAME=? [Course
		 * [courseid=1, coursename=corejava, coursefee=2000.0,
		 * courseduration=four], Course [courseid=5, coursename=corejava,
		 * coursefee=1000.0, courseduration=three]] 
		 * 
		 * findCourseNameByDuration
		 * 
		 * Hibernate: select
		 * course0_.COURSE_ID as COURSE_I1_0_, course0_.COURSE_DURATION as
		 * COURSE_D2_0_, course0_.COURSE_FEE as COURSE_F3_0_,
		 * course0_.COURSE_NAME as COURSE_N4_0_ from course_mst_tbl course0_
		 * where course0_.COURSE_DURATION=? [Course [courseid=3,
		 * coursename=hibernate, coursefee=1500.0, courseduration=three], Course
		 * [courseid=5, coursename=corejava, coursefee=1000.0,
		 * courseduration=three]]
		 */

		
		
		 tx.commit();
		 ses.close();
		 
		
		
		
	}

}
