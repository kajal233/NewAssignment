package com.stringsdemo;

public class Stringposition {
	public static void main(String[] args) {
		String name="Kajal Raj";
		System.out.println("length of the string "+name.length());
		
		String uppercasedemo="KAJAL RAJ";
		System.out.println(" string result "+name.toLowerCase());
		
		String lowercasedemo="kajal raj";
		System.out.println(" string result "+name.toUpperCase());
 
		char ast = lowercasedemo.charAt(2);
		
		System.out.println(" position of char "+ast);
}

}
