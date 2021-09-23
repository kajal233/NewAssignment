package com.threads;
 class ThreadsDemos extends Thread
{
	public void run() { //imp method given by thread class java
		
		try
		{
			System.out.println("list of threads running" + Thread.currentThread());
		}
		catch(Exception e)
		{
			System.out.println("exception caught" +e);
		}
	}
}
public class ThreadsDemo
{
	public static void main(String ar[]) {
		int numberofThreads=2;
		for(int i=0;i<numberofThreads;i++) {
			ThreadsDemos threadDemos=new ThreadsDemos();
			threadDemos.start();//life cycle of threads start() call the run math
		}
	}}