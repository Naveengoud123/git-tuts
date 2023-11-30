package com.naveen.config;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

	
	// internal default implementation provide by SPring JPA 
	// to do DB operations 
}