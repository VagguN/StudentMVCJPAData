package com.epam.StudentSpringMVCJPA.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Course {
	String coursename;
	@Id
	int courseid;
	/**
	 * @return the coursename
	 */
	public String getCoursename() {
		return coursename;
	}
	/**
	 * @param coursename the coursename to set
	 */
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	/**
	 * @return the courseid
	 */
	public int getCourseid() {
		return courseid;
	}
	/**
	 * @param courseid the courseid to set
	 */
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	@Override
	public String toString() {
		return "Course [coursename=" + coursename + ", courseid=" + courseid + "]";
	}
	
	
}

