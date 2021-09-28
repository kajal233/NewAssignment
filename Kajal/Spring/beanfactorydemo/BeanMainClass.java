package com.demo;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanMainClass {

	public static void main(String ar[]) {
		
		//this our bean factory ioc container

		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
            //bean class
		Message message = (Message) abstractApplicationContext.getBean("mybeanid");

		System.out.println(message.getMesssageinfo());

	}

}