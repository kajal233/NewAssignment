package Studentcom.demo;

import java.util.Scanner;

public class Average {
	
	public static void main(String args[])
	{
		int a,b,c,avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		a=sc.nextInt();
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		System.out.println("Enter the value of c");
		c=sc.nextInt();
		System.out.println("the average of three number is:\n");
		int sum=a+b+c;
		avg=sum/3;
		System.out.println(avg);
		
	}
}
