package com.inheritance;

class Shapes {
	void draw() {
		System.out.println("Hi I am draw funct of Shape class");
	}

	void erase() {
		System.out.println("Hi I am erase funct of Shape class");
	}

}



class Circle extends Shapes{
	
	void draw() {
		System.out.println("Hi I am draw funct of Circle class");
	}
	
}


public class ShapeDemo {
	public static void main(String[] args) {
		Shapes obj1 = new Shapes();

		obj1.draw();
		obj1.erase();

		Circle circle = new Circle();  // one way to call the  method cirle class
		circle.draw();/// this will call the versions of  circle
		
		Shapes circle1 = new Circle();  // another way to call the  method cirle class using parent class
		circle1.draw();/// this will call the versions of  circle: this  process is called run time polymorephisum or dyanmic dispatch or dyamic polymorphisum
		
	}
}