package com.pioneercoders.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course_mst_tbl")
public class Course {
	@Id
	@Column(name="COURSE_ID")
	private int courseid;
	@Column(name="COURSE_NAME")
	private String coursename;
	@Column(name="COURSE_FEE")
	private float coursefee;
	@Column(name="COURSE_DURATION")
	private String courseduration;
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public float getCoursefee() {
		return coursefee;
	}
	public void setCoursefee(float coursefee) {
		this.coursefee = coursefee;
	}
	public String getCourseduration() {
		return courseduration;
	}
	public void setCourseduration(String courseduration) {
		this.courseduration = courseduration;
	}
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename
				+ ", coursefee=" + coursefee + ", courseduration="
				+ courseduration + "]";
	}
	
	
	

}
