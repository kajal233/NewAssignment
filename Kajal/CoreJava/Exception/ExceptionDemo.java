package com.exception;

public class ExceptionDemo {
	public static void main(String ar[]) {

		int a = 9;
		int b = 0;

		try {

			int c = a / b;
			// System.out.println(c);
		}

		catch (Exception e) {

			System.out.println("Got some techical problem..come back soon" + e);
		}

	}


}
