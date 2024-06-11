package com.pp.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pp.learning.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
 
	
}
