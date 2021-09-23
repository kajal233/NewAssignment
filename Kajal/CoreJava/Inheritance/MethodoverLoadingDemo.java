package com.inheritance;

class MethodoverLoading {

	void Area() {

		int length = 9;
		int breadth = 8;
		int areaofreactangle = length * breadth;
		System.out.println("area" + areaofreactangle);

	}

	void Area(int side) {

		int length = 9;
		int breadth = 8;
		int areaofsquare = side * side;
		System.out.println("area" + areaofsquare);

	}

	void Area(int length, int breadth, int height) {

		int areaofvolume = length * breadth * height;

		System.out.println("area" + areaofvolume);
	}

}

public class MethodoverLoadingDemo {

	public static void main(String args[]) {

		MethodoverLoading methodoverLoading = new MethodoverLoading();// obj

		methodoverLoading.Area();
		methodoverLoading.Area(4);
		methodoverLoading.Area(8, 5, 7);

	}
}