package com.pp.learning;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.pp.learning.model.Employee;

import org.springframework.ui.Model;

@Controller
public class EmployeeController {
	
	
	@GetMapping("/iteration")
	public String iteration(Model model) {
		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee("prabhat", "pandey", "prabhat@123"));
		employee.add(new Employee("prajwal", "pandey", "prajwal@123"));
		employee.add(new Employee("jyoti", "sharma", "jyoti@123"));
		employee.add(new Employee("riya", "singh", "riya@123"));
		employee.add(new Employee("puja ", "kavat", "puja@123"));
		model.addAttribute("employees",employee);
		return "iteration";
		
	}
	

}
