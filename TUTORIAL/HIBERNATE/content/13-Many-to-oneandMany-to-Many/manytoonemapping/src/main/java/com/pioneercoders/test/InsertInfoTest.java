package com.pioneercoders.test;

import org.hibernate.Session;

import com.pioneercoders.entities.Student;
import com.pioneercoders.entities.University;
import com.pioneercoders.util.HibernateUtil;

public class InsertInfoTest {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Student student1 = new Student();
		student1.setFirstName("bhargav");
		student1.setLastName("su");
		student1.setSection("science");

		Student student2 = new Student();
		student2.setFirstName("chiatanya");
		student2.setLastName("p");
		student2.setSection("chemistry");

		University university = new University();
		university.setName("Usmania");
		university.setCountry("india");

		student1.setUniversity(university);
		student2.setUniversity(university);

		session.persist(university);
		session.persist(student1);
		session.persist(student2);

		session.getTransaction().commit();

		System.out.println("success");

		/*
		 * Hibernate: insert into university_mst_tbl (COUNTRY, NAME) values (?,?)
		 *  
		 * Hibernate: insert into student_mst_tbl (FIRST_NAME, LAST_NAME,
		 * SECTION, UNIVERSITY_ID) values (?, ?, ?, ?) 
		 * Hibernate: insert into
		 * student_mst_tbl (FIRST_NAME, LAST_NAME, SECTION, UNIVERSITY_ID)
		 * values (?, ?, ?, ?)
		 */

	}

}
