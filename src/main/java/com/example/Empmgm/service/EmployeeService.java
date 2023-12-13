package com.example.Empmgm.service;

import java.util.List;

import com.example.Empmgm.entity.Employee;

public interface EmployeeService {

	// I will define what ever i want to perform with employee like save,select, update, delete etc
	
	public Employee saveEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	
	public List<Employee> getEmployeList();
	
	public String delete(Long id);
	
	
}
