package com.naveen.config;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface StudentRepository extends JpaRepository<Student, Long> {

	//internal default implementation provide by Spring JPA 
	// to do DB operations
}
