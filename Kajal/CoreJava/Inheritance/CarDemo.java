package com.inheritance;

//multi level inheritance

//constructr chaining..

abstract class Car {

	Car() {

		System.out.println(" From car 50");
	}

	void showSpeed() {

		System.out.println("50");
	}

}

class TataSafri extends Car {

	TataSafri() {
		System.out.println(" from tata safri ");
	}

	void showSpeed() {
		 
		System.out.println(" 250 mph ");
	 }

}

class Marceedz extends TataSafri {

	Marceedz() {

		System.out.println("from marceedz");
	}

	void showSpeed() {

		System.out.println("400 mph");
	}
}

public class CarDemo {

	public static void main(String arg[]) {

		Marceedz marceedz = new Marceedz();

		marceedz.showSpeed();
	}
}
