package com.constructors;

/*
 * 
 * In Java, a constructor is a block of codes similar to the method. 
 * It is called when an instance of the class is created.
 * At the time of calling constructor, memory for
 *  the object is allocated in the memory. ...
 *  Note: It is called constructor because it 
 *  constructs the values at the time of object creation.
 */

public class ConstructorDemo {
	
	
	static {
		
		System.out.println(" from static block ");
	}
	// constructor
	 ConstructorDemo() {

		System.out.println(" from Constructor ");
	}

		// constructor parameterized
	 ConstructorDemo(int number1,int number2) {
		 
		 int dummy=number1+number2;

		System.out.println(" Sum of two numbers "+dummy);
	}

	 
	// method
	public void show() {

		System.out.println(" from method show");
	}
	
	static void show1() {
		
		System.out.println(" from method show1");
	}
	
	
	public static void main(String ar[])	{
		
		ConstructorDemo constructorDemo = new ConstructorDemo();
		ConstructorDemo constructorDemo1 = new ConstructorDemo(45,78);
		constructorDemo.show();
		show1();
		
	}

}
