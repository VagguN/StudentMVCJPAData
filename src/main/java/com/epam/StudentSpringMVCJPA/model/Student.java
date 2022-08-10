package com.epam.StudentSpringMVCJPA.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


@Component
@Entity
public class Student {
	
	String name; 
	@Id
	int rollNo; 
	int yoj;

	@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	
	Course course;

	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}

	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	/**
	 * @return the yoj
	 */
	public int getYoj() {
		return yoj;
	}

	/**
	 * @param yoj the yoj to set
	 */
	public void setYoj(int yoj) {
		this.yoj = yoj;
	}

	/**
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", yoj=" + yoj + ", course=" + course + "]";
	}

}
