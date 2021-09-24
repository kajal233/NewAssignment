package com.example.demo;

public class Student {

	private Integer roll;
	private String name;
	private String gender;
	private String course;
	private Integer fee;
	
	public Student(){
		super();
	}
	public Student(Integer roll,String name,String gender,String course,Integer fee){
		super();
		this.roll=roll;
		this.name=name;
		this.gender=gender;
		this.course=course;
		this.fee=fee;
		
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Integer getFee() {
		return fee;
	}
	public void setFee(Integer fee) {
		this.fee = fee;
	}
	
	
}
