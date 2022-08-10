package com.epam.StudentSpringMVCJPA.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.epam.StudentSpringMVCJPA.model.Student;

@Repository
public interface studentRepository extends CrudRepository<Student, Integer> {
	

}
