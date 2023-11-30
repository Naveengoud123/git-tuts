package com.naveen.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJpaDemo {

	public static void main(String[] args) {

		//Continer Object
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(JPAConfiguration.class);
		context.refresh();

		StudentOperations ops = context.getBean(StudentOperations.class);
		//ops.addStudent();
		//ops.deleteStudent();
		//ops.addMoreStudents();
		//ops.deleteAllStudents();
		ops.getStudentData();

	}

}