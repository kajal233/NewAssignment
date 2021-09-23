package com.exception;

public class ThrowDemo {
	static void validate(int age) {
		if (age < 18) {

			throw new ArithmeticException(" not valid for vote");
		
		} else {

			System.out.println("  valid for vote");
		}

	}
	
	
	public static void main(String ar[]) {
		
		validate(12);
	}



}
