package com.epam.StudentSpringMVCJPA;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController 
{	

	
	@RequestMapping("/")
	public String Load() {
		return "view";
	}
	
	@RequestMapping("addStudent")
	public String addStudentDetails() {
		return "addStudent";
	}
	
	@RequestMapping("AllStudentDetails")
	public String AllStudentDetails() {
		return "AllStudentDetails";
	}
	
	@RequestMapping("StudentInformation")
	public String StudentInformation() {
		return "StudentInformation";
	}
	
	@RequestMapping("DeleteStudent")
	public String DeleteStudent() {
		return "DeleteStudent";
	}
	@RequestMapping("UpdateStudent")
	public String UpdateStudent() {
		return "UpdateStudent";
	}
	
}