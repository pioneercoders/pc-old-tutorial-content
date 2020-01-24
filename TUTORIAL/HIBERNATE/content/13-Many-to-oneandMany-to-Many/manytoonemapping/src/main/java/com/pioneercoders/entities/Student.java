package com.pioneercoders.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/*
 * @ManyToOne indicates that Many student tuples can refer to one University tuple. 
 * Also note that we have provided optional=false means this relationship becomes mandatory , no student row can be saved without a university tuple reference.@JoinColumn says that there is a column UNIVERSITY_ID in Student table which will refer(foreign key) to primary key of the University table. In this example only Student to University entity navigation is possible. Not viceversa.
 */

@Entity
@Table(name="student_mst_tbl")
public class Student {
	 @Id
	    @GeneratedValue
	    @Column(name = "STUDENT_ID")
	    private long id;
	 
	    @Column(name = "FIRST_NAME")
	    private String firstName;
	 
	    @Column(name = "LAST_NAME")
	    private String lastName;
	 
	    @Column(name = "SECTION")
	    private String section;
	 
	    @ManyToOne(optional = false)
	    @JoinColumn(name="UNIVERSITY_ID")
	    private University university;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getSection() {
			return section;
		}

		public void setSection(String section) {
			this.section = section;
		}

		public University getUniversity() {
			return university;
		}

		public void setUniversity(University university) {
			this.university = university;
		}

}
