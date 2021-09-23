package com.classesobjectdemo;


class AdditionOfTwoNumbers2 {
	
	
//	non static methods need objects
	//int return
	 int  showResults() {
		int num1 = 9;  //value are assigned directly
		int num2 = 10;
		int temp = num1 + num2; // logic p art
		
		return temp;
  
	}
	 
		//string return
	 String  showStringResults() {
		
		 String name="my name is ram";
		
		return name;
  
	}

}

//client prg
public class AdditionOfTwoNumbersByReturn {

	public static void main(String ar[]) {
		// for int
		AdditionOfTwoNumbers2 additionOfTwoNumbers2 = new AdditionOfTwoNumbers2();
		
   int temp1 = additionOfTwoNumbers2.showResults();  //return type int
   
   System.out.println("result from main class"+temp1);
   
   //for string
   
	AdditionOfTwoNumbers2 stringreturn = new AdditionOfTwoNumbers2();
	
	String dummy = stringreturn.showStringResults();   //return type string 
	
	System.out.println(" String result from main class"+dummy);
	
	   
	

	}
}
