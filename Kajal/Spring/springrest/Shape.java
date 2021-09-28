package com.shape;
	class Shape {



		void draw() {
		System.out.println("draw in Shape");
		}
		void erase() {
		System.out.println("erase in Shape");
		}






		class Circle extends Shape {
		void draw() {
		System.out.println("Draw in Circle");
		}
		void erase() {
		System.out.println("erase in Circle");
		}
		}



		class triangle extends Shape {
		void draw() {
		System.out.println("Draw in triangle");
		}
		void erase() {
		System.out.println("erase in triangle");
		}
		}



		class Square extends Shape {
		void draw() {
		System.out.println("Draw in Square");
		}
		void erase() {
		System.out.println("erase in Square");
		}
		}



		public static void main(String args[]){



		Square sq = new Shape().new Square();
		sq.draw();
		sq.erase();
		Circle cir = new Shape().new Circle();
		cir.draw();
		cir.erase();
		triangle tri = new Shape().new triangle();
		tri.draw();
		tri.erase();



		}



		}
