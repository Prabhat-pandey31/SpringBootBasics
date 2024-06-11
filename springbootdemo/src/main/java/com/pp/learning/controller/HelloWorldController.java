package com.pp.learning.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class HelloWorldController {
	
	@GetMapping("/hello_world")
	public String helloWorld()  {
		return "hello world";
	}
	

}
