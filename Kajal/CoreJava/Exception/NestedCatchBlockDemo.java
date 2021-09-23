package com.exception;

public class NestedCatchBlockDemo {
	
	public static void main(String ar[]) {

		int a = 9;
		int b = 0;

		int array[] = { 1, 2, 3, 4 };

		try {// outer try

			try { // inner try

				int c = a / b;
				// System.out.println(c);
			}

			catch (ArithmeticException e) { // innerc catch bloc

				System.out.println("Got some techical problem..come back soon" + e);
			}

			try {  //inner

				System.out.println(array[6]);
			}

			catch (ArrayIndexOutOfBoundsException e) { //inne catch

				System.out.println("Got some techical problem..come back soon" + e);
			}

		}

		catch (ArithmeticException e) {  //outer catch

			System.out.println("Got some techical problem..come back soon" + e);
		}

	}


}
