package com.inheritance;


/*
 *      Properties of interface
        It always contains final data members.
        It cannot be instantiated.
        All methods of interface are abstract and public in nature.
        The class which implements interface need to provide functionality for the methods declare in the interface.
        One can use interface to implement PM (Partial multiple inheritance) and DMD (Dynamic memory dispatch).
        Interface always implements in derived class.
 * 
 * 
 * 
 * */

interface AnimalDemo {

	 abstract  public void travel();// declarations

	void body();

	void eat();

}
   //derived class
class Tiger implements AnimalDemo {

	@Override
	public void travel() {
		// implementation features of that method

		System.out.println("Tiger run very fast 100 mph");

	}

	@Override
	public void body() {
		// implementation of that method

		System.out.println("body is big");
	}

	@Override
	public void eat() {
		// implementation of that method

		System.out.println("Eat only animals");

	}

}
   //derived class
class Rat implements AnimalDemo {

	@Override
	public void travel() {
		// TODO Auto-generated method stub

		System.out.println("travels slow...");

	}

	@Override
	public void body() {
		// TODO Auto-generated method stub
		System.out.println("small body...");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub

		System.out.println("small eat");

	}

}
