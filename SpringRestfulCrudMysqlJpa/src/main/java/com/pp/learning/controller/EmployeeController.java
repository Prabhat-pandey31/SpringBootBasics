package com.pp.learning.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pp.learning.model.Employee;
import com.pp.learning.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	private EmployeeService employeeservice;

	public EmployeeController(EmployeeService employeeservice) {
		super();
		this.employeeservice = employeeservice;
	}
	
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeservice.saveEmployee(employee), HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Employee> getAllEmp(){
		return employeeservice.getAllEmployee();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmpById(@PathVariable("id") Long id) {
		return new ResponseEntity<Employee>(employeeservice.getEmpById(id), HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateemp(@PathVariable("id") Long id, @RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeservice.updateEmployee(employee, id),HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	
	public ResponseEntity<String> deleteEmp(@PathVariable("id") Long id){
		employeeservice.deleteEmpById(id);
		return new ResponseEntity<>("Employee deleted successfully", HttpStatus.OK);
	}
	

}
