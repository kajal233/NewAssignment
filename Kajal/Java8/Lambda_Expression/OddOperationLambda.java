package com.java8.lambdaexp;
interface Odd{
	int checkOdd(int num);
}

public class OddOperationLambda {

	public static void main(String args[]) {
		
		Odd oddnum=(num) ->{
			int result=(num%2);
			return result;
		};
		int flag;
		flag=oddnum.checkOdd(3);
		System.out.println(flag==0?"Even Number":"Odd Number");
	}
}
