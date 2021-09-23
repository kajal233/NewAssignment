package com.classesobjectdemo;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String ar[]) {

		Scanner scannerobj = new Scanner(System.in); // take the values from key board

		System.out.println(" Enter  an number");

		String number = scannerobj.nextLine();

		int dummyvariable = Integer.parseInt(number); // primitive types
		
		float dummy=Float.parseFloat(number);

		System.out.println(" number is" + dummyvariable);

	}

}
