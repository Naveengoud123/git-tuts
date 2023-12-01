package com.naveen.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentOperations {

	@Autowired
	StudentRepository repo;
	
	public void addStudent() {
		//Entity Object 
		Student student1 = new Student();
		student1.setStudentID(2);
		student1.setStudentName("Gopi");
		student1.setAge(32);
		
		repo.save(student1);
	}
}
