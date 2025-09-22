package com.vvit.Hibernate_App;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="emp")
public class Employee {

	@Id
	@Column(name="ID")
	private int emp_id;
	@Column(name="Name")
	private String emp_name;
	
	public Employee(int emp_id, String emp_name)
	{
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
	
	
}
