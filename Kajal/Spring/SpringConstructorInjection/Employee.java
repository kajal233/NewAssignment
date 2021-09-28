package com.spring.employe;

public class Employee {

	private String id;
	private String name;

	// we need to create constructor here

	public Employee(String id, String name) {

		this.id = id;
		this.name = name;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	//info about emp
	public void EmpInfo() {
		System.out.println("id of emp is   "+id);
		
		System.out.println("name of emp is   "+name);
			
	}
	

}
