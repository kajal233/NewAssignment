package com.inheritance;
//based class
class calculation {
	int z; // instance variable or global variable

	public void addition(int num1, int num2) {

		z = num1 + num2;
		System.out.println(" the sum fo the given number " + z);
	}
	public void substration(int num1, int num2) {

		z = num1 - num2;
		System.out.println(" the sub fo the given number " + z);
	}
}
class Mycalculation extends calculation { // Derived class
	public void multiplication(int num1, int num2) {
		z = num1 * num2;
		System.out.println(" the mul fo the given number " + z);
	}
}

public class MainInher {
	
	public static void main(String arg[]) {

		int a = 10, b = 20;

		// now we are creating the obj of derived class

		Mycalculation mycalculation = new Mycalculation();

		mycalculation.addition(a, b); // from parent class

		mycalculation.substration(a, b); /// from parent class

		mycalculation.multiplication(a, b);// this from based

	}

}
