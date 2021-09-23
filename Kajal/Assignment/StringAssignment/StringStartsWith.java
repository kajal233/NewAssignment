package com.stringsdemo;

public class StringStartsWith {
	// main method  
	public static void main(String args[])  
	{    
	// input string  
	String s1="java string split method ";    
	System.out.println(s1.startsWith("ja"));  // true  
	System.out.println(s1.startsWith("java string"));   // true  
	System.out.println(s1.startsWith("Java string"));  // false as 'j' and 'J' are different   
	}  

}
