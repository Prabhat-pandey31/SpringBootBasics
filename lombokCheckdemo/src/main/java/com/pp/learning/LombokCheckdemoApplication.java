package com.pp.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pp.learning.bean.Student;

@SpringBootApplication
public class LombokCheckdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokCheckdemoApplication.class, args);
		
		Student std = new Student();
		std.setId(0);
		std.setFirstname("prabhat");
		std.setLastname("pandey");
		
		System.out.println(std.getId());
		System.out.println(std.getFirstname());
		System.out.println(std.getLastname());
	}

}
