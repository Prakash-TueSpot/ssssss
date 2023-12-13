package com.example.Empmgm.service.Impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Empmgm.entity.Employee;
import com.example.Empmgm.repository.EmployeeRepositoy;
import com.example.Empmgm.service.EmployeeService;

@Service
public class EmployeeServiceImpl  implements EmployeeService{
	
	@Autowired
	private EmployeeRepositoy employeeRepositoy;

	@Override
	public Employee saveEmployee(Employee employee) {
		employee.setCreateAt(new Date());
		employee.setUpdateAt(new Date());
		
		//Employee save = this.employeeRepositoy.save(employee);
	  	
		return employeeRepositoy.save(employee);
	}

	@Override                               //Used to update individual records of the column name
	public Employee updateEmployee(Employee employee) {
		         //This variable is used to update all the records 
		Employee employee2 = this.employeeRepositoy.findById(employee.getId()).get();
		employee2.setUpdateAt(new Date());
		employee2.setDesgn(employee.getDesgn());
		employee2.setEmail(employee.getEmail());
		employee2.setName(employee.getName());
		Employee save = this.employeeRepositoy.save(employee2);
		return save;
	}

	@Override
	public List<Employee> getEmployeList() {
		List<Employee> empListResponse = this.employeeRepositoy.findAll();
		return empListResponse;
	}

	@Override
	public String delete(Long id) {
		this.employeeRepositoy.deleteById(id);
		return "Data Deleted !!";
	}

	
}
