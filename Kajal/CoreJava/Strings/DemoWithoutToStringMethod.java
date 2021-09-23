package com.stringsdemo;

class Student {

	int rollnumber;
	String name;

	Student(int rollnumber, String name) {

		this.rollnumber = rollnumber;
		this.name = name;

	}

	// should write by developer
	@Override
	public String toString() {
		return "Student [rollnumber is=" + rollnumber + ", name is=" + name + "]";
	}

}

public class DemoWithoutToStringMethod {

	public static void main(String ar[]) {

		Student s1 = new Student(101, "raj");

		// If you print any object, Java compiler
		// internally invokes the toString() method on the object.
		// So overriding the toString() method, returns the desired output,
		// it can be the state of an object etc. depending on your implementation.

		System.out.println(s1);// compiler writes here s1.toString()

	}

}
