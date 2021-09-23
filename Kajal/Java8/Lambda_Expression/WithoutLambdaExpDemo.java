package com.java8.lambdaexp;

interface Drawable {
	public void draw();
}

public class WithoutLambdaExpDemo {

	public static void main(String[] args) {
		int width =10;
		//without lambda, Drawable implementation using anonymous class
		Drawable d=new Drawable() {  //interface object
			public void draw() {
				System.out.println("Drawing " + width);
			}
		};
		d.draw();
	}
}