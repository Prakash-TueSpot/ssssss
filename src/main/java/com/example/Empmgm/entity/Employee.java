package com.example.Empmgm.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



/*Entity :- Entity is nothing but java class. It is just java class but if we give some annotations to the java class
 * 			it will behave like database table and jpa orm tool easily understand the developer want to create the table
 *			after giving the below annotations jpa will take action and create table for you. when ever you want to save data
 *          you set your data in your entity object and directly save with the help of jpa reposity save method
 *          
 *          
 *          the below are the anotations to create the entity
 *          
 *			1) @Entity = it will define your class as entity
 *          2) @Table = if you want to write a specific table name
 *          3) @Id = for primary key
 *          4) @GenrateValue = to give the auto_genrate strategy to the primary key
 *          5) @Column = if you want to give specific name to the column and want to define the length of the column                  
 * 
 * 
 * 
 * 
 * */


@Entity
public class Employee {
	
	//primary key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//This will show emp_name in database side and name in eclipse
	@Column(name = "emp_name", length = 20)
	private String name;
	private String email;
	private String desgn;
	
	private Date createAt;
	private Date updateAt;
	public Employee(Long id, String name, String email, String desgn, Date createAt, Date updateAt) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.desgn = desgn;
		this.createAt = createAt;
		this.updateAt = updateAt;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesgn() {
		return desgn;
	}
	public void setDesgn(String desgn) {
		this.desgn = desgn;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", desgn=" + desgn + ", createAt="
				+ createAt + ", updateAt=" + updateAt + "]";
	}
	
	
	
	

}
