package com.classesobjectdemo;

public class StaticMethodDemo {

	static {

		System.out.println("From static block");   //static block

	}
	
	static {

		System.out.println("From static block 1");   //static block

	}

	static int num1 = 5; // static variable

	static void Show(String name) {   //static  method

		System.out.println(" my name is " + name);
	}

	public static void main(String arg[]) {

		StaticMethodDemo.Show("Ram");// calling from class name reference

		Show("Sham"); // directly called due static main method

		// StaticMethodDemo s = new StaticMethodDemo();
		
		System.out.println(" static number"+StaticMethodDemo.num1);

	}

}
