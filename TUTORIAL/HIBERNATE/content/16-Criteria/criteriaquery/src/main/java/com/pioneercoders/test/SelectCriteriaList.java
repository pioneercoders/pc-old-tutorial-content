package com.pioneercoders.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.pioneercoders.model.Course;
import com.pioneercoders.util.HibernateUtil;

public class SelectCriteriaList {
	public static void main(String[] args) {
		Session ses = HibernateUtil.getSessionFactory().openSession();
		
		
		Transaction tx = ses.beginTransaction();
		
		
		//for select queries(select) we don't need to begin Transaction in hibernate 
		//for non-select queries(insert,update,delete) we have to begin transactions because we have to apply changes on db after saving changes until we call tx.commit() changes doesn't effect on db 
		//in this by using criteriaapi i'm getting list of data  from database 
		Criteria c=ses.createCriteria(Course.class);//passing  Entity Class as argument  
		List criterialist=c.list(); 
		//while selecting data it's better to override  toString() method otherwise it will prints hashcode values of Course Class 
		System.out.println(criterialist);
		
		
		//if i want to get only some of the records from one to third record we will use below scenario

		Criteria criteria=ses.createCriteria(Course.class);  
		c.setFirstResult(0);//'0' index it display first value in database 
		c.setMaxResults(3); //it will display three results  
		List minrecords=c.list();  
		System.out.println(minrecords);
		
		
		//if want to display courses where coursefee greater than 1000 for this we have to restrictions (where clause in criteria)
		
		Criteria crite=ses.createCriteria(Course.class);  
		c.add(Restrictions.gt("coursefee",1000.0f));//coursefee is the propertyname  
		List restrictresult=c.list(); 
		System.out.println(restrictresult);
		
		/*
		 * Hibernate: 
    select
        this_.COURSE_ID as COURSE_I1_0_0_,
        this_.COURSE_DURATION as COURSE_D2_0_0_,
        this_.COURSE_FEE as COURSE_F3_0_0_,
        this_.COURSE_NAME as COURSE_N4_0_0_ 
    from
        course_mst_tbl this_ 
    where
        this_.COURSE_FEE>? limit ?
[Course [courseid=1, coursename=corejava, coursefee=2000.0, courseduration=four], Course [courseid=3, coursename=hibernate, coursefee=1500.0, courseduration=three], Course [courseid=4, coursename=spring, coursefee=1500.0, courseduration=four]]

		 */
		
		
		
		 tx.commit();
		 
		 ses.close();
		 
		
		
		
		
	}

}
