package com.hibernateStudent;

public class Student {



	private int EnrollmentNo;
	private String name;
	private String department;
	
	
	public Student() {
		super();
	}
	
	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
		
	}
	
	public int getEnrollmentNo() {
		return EnrollmentNo;
	}
	public void setEnrollmentNo(int enrollmentNo) {
		this.EnrollmentNo = enrollmentNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}