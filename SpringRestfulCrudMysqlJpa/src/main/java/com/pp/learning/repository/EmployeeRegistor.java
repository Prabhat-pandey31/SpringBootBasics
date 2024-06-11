package com.pp.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pp.learning.model.Employee;

public interface EmployeeRegistor extends JpaRepository<Employee, Long> {

}
