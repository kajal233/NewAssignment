package com.EmployeeAssignment;

public class Employee {


private Integer empNo;
private String name;
private Integer age;
private String location;
public Employee(Integer empNo, String name, Integer age, String location) {
	super();
	this.empNo = empNo;
	this.name = name;
	this.age = age;
	this.location = location;
}
public Integer getEmpNo() {
	return empNo;
}
public void setEmpNo(Integer empNo) {
	this.empNo = empNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}


}