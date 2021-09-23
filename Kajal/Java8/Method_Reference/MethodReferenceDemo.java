package com.java8.methodreferencedemo;

interface Person {

	void eat();
}


interface Sayable5 {

	void say();
}

public class MethodReferenceDemo {

	public static void saySomeThing() {

		System.out.println(" hello !");
	}

	public static void main(String ag[]) {

		Person sayblee = MethodReferenceDemo::saySomeThing; /// creating reference of FI and call the method on based
																/// of class reference due to static in nature

		sayblee.eat();
		
		
		Sayable5 sayblee5 = MethodReferenceDemo::saySomeThing;
		
		sayblee5.say();

	}

}
