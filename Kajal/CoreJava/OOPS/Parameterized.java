package com.demo1;

public class Parameterized {


		  String languages;

		  // constructor accepting single value
		  Parameterized (String lang) {
		    languages = lang;
		    System.out.println(languages + " Programming Language");
		  }

		  public static void main(String[] args) {

		    // call constructor by passing a single value
			  Parameterized  obj1 = new Parameterized ("Java");
			  Parameterized  obj2 = new Parameterized ("Python");
			  Parameterized  obj3 = new Parameterized ("C");
		  }
		}



