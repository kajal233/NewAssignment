package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	@Autowired
	public Address add;

	@Autowired
	public Course c;
//student information
	public void StudentInfo() {

		add.myAddress();
		c.Subject();

	}

}
