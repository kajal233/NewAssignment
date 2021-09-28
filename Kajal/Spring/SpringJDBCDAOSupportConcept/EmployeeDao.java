package com.spring;

import java.util.List;

public interface EmployeeDao {

	public Employee findEmployeeById(int empId);// name of emp by id

	public List<Employee> findAllEmployees();// all info from db

	// create
	// update
	// delete

	// jdbc support
	// Simple dao class student rowmappler

}
