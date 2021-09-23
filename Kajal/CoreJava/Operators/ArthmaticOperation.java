package com.operators;

public class ArthmaticOperation {

	public static void main(String args[]) {

		int a = 10;// this is not object

		Integer i = new Integer(5);// object this wrapper class

		int b = 5;
		
		System.out.println(a + b);// 15
		System.out.println(a - b);// 5
		System.out.println(a * b);// 50
		System.out.println(a / b);// 2
		System.out.println(a % b);// 0

	}

}
