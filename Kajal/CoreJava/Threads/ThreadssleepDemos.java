package com.threads;
	//implemented by implement runnable interface
	class ThreadssleepDemos extends Thread {

		public void run() { // imp method given by thread class java

			// logic part
			try {
				for (int i = 1; i < 5; i++) {
					Thread.sleep(5000);
					System.out.println(i);
				}

			} catch (Exception e) {

				System.out.println("exception caught" + e);

			}

		}

	}

	public class ThreadsSleepDemo {

		public static void main(String ar[]) {

			ThreadssleepDemos threadsDemos = new ThreadssleepDemos();// created the object of a class

		
			
			threadsDemos.start();


		}

	}
	