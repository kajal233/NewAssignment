package com.classesobjectdemo;

 class AdditionOfTwoNumbers1 {
	
	 //method with no parameters
	 
	 void showResults() {
		int num1 = 9;  //value are assigned directly
		int num2 = 10;
		int temp = num1 + num2; // logic p art
    	System.out.println(" additons of two number" + temp);  //results are printed here only not returning to the main();
	}

	 
	     //method with parameters    15      82         67
	void showResultsByParameter(int num1,int num2,int num3) {
		int temp = num1 + num2 + num3; // logic p art 
    	System.out.println(" additons of two number" + temp);
	}
}

//client prg
public class AdditionOfTwoNumbers {

	public static void main(String ar[]) {

		// create an object class AdditionOfTwoNumbers

		AdditionOfTwoNumbers1 additionOfTwoNumbers = new AdditionOfTwoNumbers1(); // obj 1
		additionOfTwoNumbers.showResults();
		
		// create an object class AdditionOfTwoNumbers by passing parameter
		AdditionOfTwoNumbers1 additionOfTwoNumbers2 = new AdditionOfTwoNumbers1();  //obj 2
		
		additionOfTwoNumbers2.showResultsByParameter(15, 85,67);///

	}
}
