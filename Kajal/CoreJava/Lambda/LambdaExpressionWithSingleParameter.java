package com.java8.lambdaexp;
//with parameter with return type

interface Sayable2{
	String Say(String name);}

public class LambdaExpressionWithSingleParameter {
	public static void main(String[] args) {
		Sayable2 s= (name) ->{
			return "my name is..." + name;
		};
		System.out.println(s.Say("Kajal"));
		
		}
	}


