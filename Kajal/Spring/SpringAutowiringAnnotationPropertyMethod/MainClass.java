package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String ar[]) {

		// created spring ioc container
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

		Student s = (Student) applicationContext.getBean("stud");

		s.StudentInfo();

	}

}
