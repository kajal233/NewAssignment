package com.demo1;

public class Constructor {
	
		  String name;

		  // public constructor
		  public Constructor() {
		    name = "Program";
		  }
		}

		class Main {
		  public static void main(String[] args) {

		    // object is created in another class
		    Constructor obj = new Constructor();
		    System.out.println("Constructor name = " + obj.name);
		  }
		}