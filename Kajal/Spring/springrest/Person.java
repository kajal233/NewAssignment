package com.shape;
	public class Person 
	{ 
	    String name;
	    
	    public Person() {
	        System.out.println("Calling Person constructor");
	        name = "Default";
	    }
	}
	 
	class Employee extends Person {
	 
	    String name;
	    int age;
	 
	    public Employee() {
	        System.out.println("Calling Employee class constructor");
	        this.name = "Kajal";
	    }
	 
	    public void workOnAssignment() {
	// Working on assignment
	    }
	 
	    public String getName() {
	        return name;
	    }
	 
	    public void setName(String name) {
	        this.name = name;
	    }
	 
	    public int getAge() {
	        return age;
	    }
	 
	    public void setAge(int age) {
	        this.age = age;
	    }
	 
	    public void printName() {
	        System.out.println("Printing default name from person class : " + super.name);
	    }
	 
	    public static void main(String args[]) {
	        Employee e1 = new Employee();
	 
	        e1.printName();
	    }
	}
