package com.example.Empmgm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Empmgm.entity.Employee;
import com.example.Empmgm.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/emp")
public class EmployeeController {

	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return this.employeeService.saveEmployee(employee);
	}
	
	@PutMapping("/")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return this.employeeService.updateEmployee(employee);
	}
	
	
	@GetMapping("/")
	public List<Employee> getEmpList(){
		return this.employeeService.getEmployeList();
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable("id") Long id) {
		return this.employeeService.delete(id);
	}
	
}
