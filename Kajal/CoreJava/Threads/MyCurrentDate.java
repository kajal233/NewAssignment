package com.threads;

//Create a class called MyCurrentDate that implements Runnable interface.
//The MyCurrentDate class displays the current date and time 10 times, with 100 milliseconds interval - use sleep() method for this interval.

import java.time.LocalDate;
	import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;

public class MyCurrentDate {
		
		public void printDateTime(String message) {
			for(int i=1;i<=10;i++) {
				DateTimeFormatter datetimeFormatter=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
				LocalDateTime datetime=LocalDateTime.now(); 
				System.out.println(message+" Date "+i+" times : "+datetimeFormatter.format(datetime));
				
				try {
					Thread.sleep(100);
				}
				catch(Exception e) {
					System.out.println(e);
					
				}
			}
			
		}
	}

	//First
	class MyCurrentDate1 implements Runnable{
	    String msg="First Thread";
	    MyCurrentDate mycurrentdate;
		MyCurrentDate1(MyCurrentDate mycurrentdate ) {
			this.mycurrentdate=mycurrentdate;
		}
		public void run() {
			
			mycurrentdate.printDateTime(msg);		
		}
		
	}

	//Second
	class MyCurrentDate2 implements Runnable{
	    String msg="Second Thread";
	    MyCurrentDate mycurrentdate;
		MyCurrentDate2(MyCurrentDate mycurrentdate) {
			this.mycurrentdate=mycurrentdate;
		}
		public void run() {
			
			mycurrentdate.printDateTime(msg);		
		}
		
	}

	//Third
	class MyCurrentDate3 implements Runnable{
	  String msg="Third Thread";
	  MyCurrentDate mycurrentdate;
		MyCurrentDate3(MyCurrentDate mycurrentdate) {
			this.mycurrentdate=mycurrentdate;
		}
		public void run() {
			
			mycurrentdate.printDateTime(msg);		
		}
		
	}

	public class MyMain {
		
		public static void main(String args[]) {
			
			MyCurrentDate  mycurrentdate=new MyCurrentDate ();
			MyCurrentDate1 myCurrentDate1=new MyCurrentDate1(mycurrentdate);
			Thread thread=new Thread(myCurrentDate1);
			
			//For second thread
			MyCurrentDate2 myCurrentDate2=new MyCurrentDate2(mycurrentdate);
			Thread thread2=new Thread(myCurrentDate2);
			
			//For third thread
			MyCurrentDate3 myCurrentDate3=new MyCurrentDate3(mycurrentdate);
			Thread thread3=new Thread(myCurrentDate3);
			
			thread.start();		
			thread2.start();		
			thread3.start();
			
		}
	}
	