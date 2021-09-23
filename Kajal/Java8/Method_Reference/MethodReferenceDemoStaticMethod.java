package com.java8.methodreferencedemo;


	import java.util.function.BiFunction;

	class Arithmatic {
		public static int add(int a, int b) {

			return a + b;

		}

		public static float add(float a, float b) {

			return a + b;

		}

		public static float add(int a, float b) {

			return a + b;

		}

	}

	/*
	 * The BiFunction Interface is a part of the java.util.function package which
	 * has been introduced since Java 8, to implement functional programming in
	 * Java. It represents a function which takes in two arguments and produces a
	 * result.
	 * 
	 * Hence this functional interface which takes in 3 parameters namely:-
	 * 
	 * T: denotes the type of the first argument to the function U: denotes the type
	 * of the second argument to the function R: denotes the return type of the
	 * function The lambda expression assigned to an object of BiFunction type is
	 * used to define its apply() which eventually applies the given function on the
	 * arguments. The main advantage of using a BiFunction is that it allows us to
	 * use 2 input arguments while in function we can only have 1 input argument.
	 */

	public class MethodReferenceDemoStaticMethod {

		public static void main(String ar[]) {

			BiFunction<Integer, Integer, Integer> adder1 = Arithmatic::add;

			BiFunction<Float, Float, Float> adder2 = Arithmatic::add;

			BiFunction<Float, Integer, Float> adder3 = Arithmatic::add;

			int result1 = adder1.apply(10, 20);// apply() method is come from java 8 api

			float result2 = adder2.apply(10.5f, 20.5f);// apply() method is come from java 8 api

			float result3 = adder3.apply(10.5f, 20);// apply() method is come from java 8 api

			System.out.println(result1);
			System.out.println(result2);
			System.out.println(result3);

		}


}
