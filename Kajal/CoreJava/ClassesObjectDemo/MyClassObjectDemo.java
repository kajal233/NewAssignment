package com.classesobjectdemo;

class DrawringRoom {

	void showDetailsOfDrawringRoom(String name) {

		System.out.println("list of  items " + name);

	}

}

class Kitchen {

	void showDetailsOfKitchen(String name) {

		System.out.println("kitchen   items " + name);

	}

}

public class MyClassObjectDemo {

	public static void main(String ar[]) {

		DrawringRoom chair = new DrawringRoom();// Object created for chair
		DrawringRoom table = new DrawringRoom();// Object created for table
		DrawringRoom sofa = new DrawringRoom();// Object created for sofa

		chair.showDetailsOfDrawringRoom("chair");// calling method need object

		table.showDetailsOfDrawringRoom("joyti s table");

		sofa.showDetailsOfDrawringRoom("for sofa");

		Kitchen freeze = new Kitchen();
		freeze.showDetailsOfKitchen("Samsung");

	}

}
