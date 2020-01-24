package com.pioneercoders.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="university_mst_tbl")
public class University {
	 @Id
	    @GeneratedValue
	    @Column(name = "UNIVERSITY_ID")
	    private long id;
	 
	    @Column(name = "NAME")
	    private String name;
	 
	    @Column(name = "COUNTRY")
	    private String country;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}
	 

}
