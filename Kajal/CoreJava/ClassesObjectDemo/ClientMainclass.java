package com.classesobjectdemo;

public class ClientMainclass {

	public static void main(String[] args) {
		
		
		PrivateDemo privateDemo =new PrivateDemo();
		
		
	//	privateDemo.show(); //priavte  //cant access ,how to access ?
		
	//	privateDemo.show1(); ///public
		
	
		
		//privateDemo.setBalance(80000);///edit or update
		
		int k = privateDemo.getBalance();
		
		privateDemo.setAddress(" i m living in delhi");
		
		String addrss=privateDemo.getAddress();
		
		System.out.println(addrss);
	
		
		
		
		
	}

}
