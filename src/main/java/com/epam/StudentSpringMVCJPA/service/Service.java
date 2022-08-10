package com.epam.StudentSpringMVCJPA.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.epam.StudentSpringMVCJPA.dao.studentRepository;
import com.epam.StudentSpringMVCJPA.model.Student;

@org.springframework.stereotype.Service
public class Service
{
	@Autowired    
		studentRepository repository;
		public Student createStudentProfile(Student student) {
		// TODO Auto-generated method stub
		repository.save(student);
		return student;
	}

	
		public Student getStudentById(int sid) {
		// TODO Auto-generated method stub
			Optional<Student> student=repository.findById(sid);
			List<Student> students=toList(student);
		return students.get(0);				
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> students=(List<Student>) repository.findAll();
		return students;
	}

	public void deleteStudent(int sid) {
		// TODO Auto-generated method stub
		repository.deleteById(sid);
	}

	public void updateStudent(Student stu) {
		// TODO Auto-generated method stub
		repository.save(stu);
			
		}
	public static List<Student> toList(Optional<Student> opt) {
	    return opt
	            .map(Collections::singletonList)
	            .orElseGet(Collections::emptyList);
	}
}