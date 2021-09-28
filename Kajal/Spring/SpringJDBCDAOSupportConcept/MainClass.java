package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String a[]) {

		String confFile = "beans.xml";

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);

		EmployeeDao empDao = (EmployeeDao) context.getBean("employeeDAO");

		Employee emp = empDao.findEmployeeById(2);

		String demtname = emp.getDept();

		String salary = emp.getSalary();

		String name = emp.getName();

		System.out.println();

		// Employee emp = empDao.findEmployeeById(1);// get emp by his id

		System.out.println(
				" my dept name \n\n" + demtname + " this is my salary| " + salary + " name of emplpoyee \n" + name);

		System.out.println("-----------------------------------------------");

	}

}