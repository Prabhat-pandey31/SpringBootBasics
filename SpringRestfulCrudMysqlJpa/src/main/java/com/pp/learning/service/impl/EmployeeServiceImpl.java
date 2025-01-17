package com.pp.learning.service.impl;

import java.util.List;



import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.learning.exception.ResourceNotFoundException;
import com.pp.learning.model.Employee;
import com.pp.learning.repository.EmployeeRegistor;
import com.pp.learning.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRegistor employeeRegistory;
	
	
	public EmployeeServiceImpl(EmployeeRegistor employeeRegistory) {
		super();
		this.employeeRegistory = employeeRegistory;
	}



	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRegistory.save(employee);
		
	}



	@Override
	public List<Employee> getAllEmployee() {
		return employeeRegistory.findAll();
	}



	@Override
	public Employee getEmpById(Long id) {
		
	      java.util.Optional<Employee> employee= employeeRegistory.findById(id);
	      if(employee.isPresent()) {
	    	  return employee.get();
	      }else {
	    	  throw new ResourceNotFoundException("Employee", "Id", id);
	      }
		// return employeeRegistory.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee", "Id", id));
	}



	@Override
	public Employee updateEmployee(Employee employee, Long id) {
		Employee existingemp = employeeRegistory.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee", "Id", id));
		existingemp.setFirstname(employee.getFirstname());
		existingemp.setLastname(employee.getLastname());
		existingemp.setEmail(employee.getEmail());
		employeeRegistory.save(existingemp);
		return existingemp;
	}



	@Override
	public void deleteEmpById(Long id) {
		employeeRegistory.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee", "Id", id));
		employeeRegistory.deleteById(id);
	}

}
