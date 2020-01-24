package com.pioneercoders.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pioneercoders.model.Course;
import com.pioneercoders.util.HibernateUtil;

public class SELECTLIST {
	public static void main(String[] args) {
		
		
		Session ses = HibernateUtil.getSessionFactory().openSession();
		//in this we are showing example on hql ,in that how iterate list of data from database using hql 
		//first write the query to fetch from database 
		Transaction tx = ses.beginTransaction();
		
		
		Query query =ses.createQuery("from Course");
		//it will returns all the data its return type is list 
		List<Course> course = query.list();
		
		//print that collection  or use foreach loop to iterate 
		System.out.println(course);
		
		for(Course element:course){
			System.out.println(element);
		}
		        
		//if we want to only some of the properties in course_mst_tbl like only coursenames we will select clause 
		Query queryselect= ses.createQuery("SELECT C.coursename FROM Course C");
		 
		 List results = queryselect.list();
		 System.out.println(results);
		
		 //generally we use where clause to minimize the results i want to now where duration is only one month 
		 //i'm getting only one result here i'm calling unique result from query
		 Query whereselect = ses.createQuery("FROM Course C WHERE C.courseduration='one'");
		Course  result =(Course) whereselect.uniqueResult();
		System.out.println(result);
		
		tx.commit();
		  
		 ses.close();
		 
		
	}

}
