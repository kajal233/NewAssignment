package com.java8.methodreferencedemo;

interface Sayable6 {

	void say();
}



public class InstantMethodDemo {
	
	//non static method
		public void saySomeThing() {

			System.out.println(" hello !");
		}

		public static void main(String ag[]) {

			//1
			//  Referring non-static method using reference  
			
			InstantMethodDemo instantMethodDemo= new InstantMethodDemo();//created class object
			
			
			//2
			Sayable6 sayable6 = instantMethodDemo::saySomeThing;
			
			
			sayable6.say();//way to calling the interface method
			
			// by using in lambda expression
	//3 ways
			Sayable6 sa= new InstantMethodDemo()::saySomeThing;
			// way to calling the interface method
			sa.say();
			
		

		}


}
