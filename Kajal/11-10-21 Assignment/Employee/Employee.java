package com.demo;
import java.util.Scanner;
public class Employee {
	private String id = null;
	private String name = null;
	private String addrs = null;
	private int sal = 0;
	
	
	 void getData() {
		// TODO Auto-generated method stub
		 @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Employee ID:  ");
			id = sc.next();
			System.out.println("Name:         ");
			name = sc.next();
			System.out.println("Address:      ");
			addrs = sc.next();
			System.out.println("Salary:       ");
			sal = sc.nextInt();
	}

 void displayData() {
		// TODO Auto-generated method stub
	 System.out.println("Employee ID:  "+id);
		System.out.println("Name:         "+name);
		System.out.println("Address:      "+addrs);
		System.out.println("Salary:       "+sal);
	}
}