package com.java8.functionalintefaace;

	interface sayable3 {
		//Default Methods provide a way to provide a default implementation for a method in an interface.
//			By providing a default implementation, you can add new methods to your
			//interface without breaking backwards compatibility for existing code 
			//that already implements your interfaces.
			default void Doit() {

				System.out.println(" i am default method"); // new in java 8
			}
		}

		@FunctionalInterface
		interface sayable2 extends sayable3 {

			void say(String msg);
		}

		public class FunctionalInterfaceWithNormalInterface implements sayable2 {

			@Override
			public void say(String msg) {
				System.out.println(msg);

			}

			public static void main(String ag[]) {

				FunctionalInterfaceWithNormalInterface f = new FunctionalInterfaceWithNormalInterface();
				f.say("Hi !  how are u");

				f.Doit();

			}


}
