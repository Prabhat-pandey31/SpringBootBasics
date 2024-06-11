package com.pp.learning.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pp.learning.Bean.Student;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("prabhat","pandey");
	}
	
	@GetMapping("/students")
	public List<Student> getstudents(){
		List<Student> student = new ArrayList<>();
		student.add(new Student("prajwal","pandey"));
		student.add(new Student("prabhat","pandey"));
		student.add(new Student("praveen","kuntal"));
		student.add(new Student("kunal","agarwal"));
		student.add(new Student("lalit","raj"));
		return student;
	}
	
	
	@GetMapping("/student/{firstname}/{lastname}")
	public Student getstudentname(@PathVariable("firstname") String f, @PathVariable("lastname") String l) {
		return new Student(f,l);
	}
	
	@GetMapping("/student/query")
	public Student getrequestparam(@RequestParam(name ="firstname") String f,@RequestParam(name = "lastname") String l) {
		return new Student(f, l);
	}

}
