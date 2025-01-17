package com.pp.learning.service;

import java.util.List;

import com.pp.learning.model.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployee();
	Employee getEmpById(Long id);
	Employee updateEmployee(Employee employee,Long id);
	void deleteEmpById(Long id);

}
