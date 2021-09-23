package com.demo1;

public class Overloading {
	

		  String language;

		  // constructor with no parameter
		  Overloading() {
		    this.language = "Java";
		  }

		  // constructor with a single parameter
		  Overloading(String language) {
		    this.language = language;
		  }

		  public void getName() {
		    System.out.println("Programming Langauage: " + this.language);
		  }

		  public static void main(String[] args) {

		    // call constructor with no parameter
			  Overloading obj1 = new Overloading();

		    // call constructor with a single parameter
			  Overloading obj2 = new Overloading("Python");

		    obj1.getName();
		    obj2.getName();
		  }
		}

