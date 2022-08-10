package com.epam.StudentSpringMVCJPA.dao;

import java.util.List;

import com.epam.StudentSpringMVCJPA.model.Student;

public interface StudentDao {
	
	public Student createStudent(Student s);
	
	public Student getStudentId(int sid);
	
	public List<Student> getStudents();
	
	public void deleteStudentbyId(int sid);
	
	public void updateStudentbyId(Student s);

}
