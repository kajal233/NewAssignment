package com.java8.optionaldemo;

import java.util.Optional;

/*
Java introduced a new class Optional in jdk8.
It is a public final class and used to deal with 
NullPointerException in Java application. 
You must import java.util package to use this class. 
It provides methods which are used to check the presence of value for particular variable.*/

public class OptionalDemo {

	Integer sum(Optional<Integer> a, Optional<Integer> b) {

		System.out.println("first parameter is present " + a.isPresent());
		System.out.println("first parameter is present " + b.isPresent());

		// Optional.orElse - returns the value if present otherwise returns
		// the default value passed.
		Integer value1 = a.orElse(new Integer(0));

		//
		// Optional.get - gets the value, value should be present
		Integer value2 = b.get();

		return value1 + value2;

	}

	public static void main(String arg[]) {

		OptionalDemo optionalDemo = new OptionalDemo();

		Integer value1 = null;

		Integer value2 = new Integer(10);

		// //Optional.ofNullable - allows passed parameter to be null.
		Optional<Integer> a = Optional.ofNullable(value1);

		// //Optional.of - throws NullPointerException if passed parameter is null
		Optional<Integer> b = Optional.of(value2);

		System.out.println(optionalDemo.sum(a, b));

	}

}
