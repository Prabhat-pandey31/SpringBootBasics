package com.pp.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pp.learning.entity.Student;
import com.pp.learning.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
//        Student std1 = new Student("Prabhat", "Pandey", "prabhatpandey3105@gmail.com");
//        studentRepository.save(std1);
//
//        Student std2 = new Student("Joy", "Dsouza", "joydsouza3105@gmail.com");
//        studentRepository.save(std2);
//
//        Student std3 = new Student("Tony", "Stark", "tonystark2024@gmail.com");
//        studentRepository.save(std3);
    }
}


