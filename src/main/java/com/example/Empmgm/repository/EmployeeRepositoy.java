package com.example.Empmgm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Empmgm.entity.Employee;



/*
 * Repository :- Repository as some predefined methods to do the database side operation like create,update, select , delete
 * 				so we are able to use this predefined methods to do this operations. 
 * 
 * == Way to create repository
 * Repository we will create as interface.
 * we will extend the JpaRepository and will give entity name and entity primary key in the generic of JpaRepository
 * Put @Repository annotation on the repository 
 * 
 * */



@Repository
public interface EmployeeRepositoy extends JpaRepository<Employee, Long>{

}
