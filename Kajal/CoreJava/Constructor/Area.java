package com.constructors;

public class Area {

	Area() {
		int length = 9;
		int breadth = 8;

		int areaofreactangle = length * breadth;

		System.out.println("area" + areaofreactangle);
	}

	Area(int side) {
		int length = 9;
		int breadth = 8;

		int areaofsquare = side * side;

		System.out.println("area" + areaofsquare);
	}

	Area(int length, int breadth, int height) {

		int areaofvolume = length * breadth * height;

		System.out.println("area" + areaofvolume);
	}

	public static void main(String ar[]) {

		Area area = new Area();
		Area areaofsquare = new Area(5);
		Area areaofvolume = new Area(5,5,5);
				
	}

}
