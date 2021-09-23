package com.inheritance;

public class Salary extends Employee {

	private double salary;

	Salary(String name, String address,String phnumber, double salary) {
		super(name, address, phnumber);
		setSalary(salary);

	}

	public void mailCheck() { // override here

		System.out.println("mail check to " + salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double newsalary) {

		if (newsalary > 0.0) {
			this.salary = newsalary;

		}

	}
}
