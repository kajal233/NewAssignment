package com.java8.lambdaexp;
interface Prime{
	int isPrime(int num);
}
public class PrimeOperation {
	public static void main(String args[]) {
		Prime prime=(num)->{
			int check=0,result;
			for(int i=2;i<num/2;i++) {
				if(num%2!=0) {
					check=1;
					break;
				}
				
			}
			return check;
		};
		int result=prime.isPrime(5);
		System.out.println("The given number is : "+(result==1?"Not Prime":"Prime"));
	}



}
