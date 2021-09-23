package com.exception;

public class MutilpleCatchBlockDemos {
	public static void main(String ar[]) {

		int array[] = { 1, 2, 3, 4 };

		try {

			System.out.println(array[6]);
		}

		catch (ArithmeticException e) {

			System.out.println("Got some .........come back soon" + e);
		}
		
		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Got ..come back soon" + e);
		}

		catch (ClassCastException e) {

			System.out.println("Got some techical problem..come back soon" + e);
		}

	

	}}

