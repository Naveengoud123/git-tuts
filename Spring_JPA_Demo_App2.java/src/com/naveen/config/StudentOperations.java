package com.naveen.config;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentOperations {

	// DI
	@Autowired
	StudentRepository repo;

	public void addStudent() {

		// Entity Object
		Student student1 = new Student();
		student1.setStudentID(100);
		student1.setStudentName("Rahul");
		student1.setAge(25);

		// Passing entity Object to repo
		// TO make Db operation
		// Inserting student details
		// call save(Entity) , then Internally I will take care of inserting data of
		// entity Object
		repo.save(student1);

	}

	public void deleteStudent() {
		repo.deleteById(1l);
	}

	// add 3 students details at a time
	public void addMoreStudents() {
		ArrayList<Student> studetns = new ArrayList<>();
		Student student1 = new Student();

		student1.setStudentID(3);
		student1.setStudentName("Ganga");
		student1.setAge(25);
		studetns.add(student1);

		Student student2 = new Student();
		student2.setStudentID(4);
		student2.setStudentName("Krithvik");
		student2.setAge(04);

		studetns.add(student2);

		Student student3 = new Student();
		student3.setStudentID(5);
		student3.setStudentName("Akhil");
		student3.setAge(20);

		studetns.add(student3);

		repo.saveAll(studetns);

	}

	public void deleteAllStudents() {
		repo.deleteAll();
	}

	public void getStudentData() {
		Optional<Student> student = repo.findById(1l );

		Student stu = student.get();
		System.out.println(stu.getAge());
		System.out.println(stu.getStudentID());
		System.out.println(stu.getStudentName());
	}

}