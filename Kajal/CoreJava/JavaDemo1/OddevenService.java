package com.oddeven;

public class OddevenService {
	public int getOddeven(int num) {
		int check=0;
		if(num%2==0) {
			check=1;
		}
		else
		{
			check=0;
		}
		return check;
	}
	//for printing
	public void getOddevenNum(int num)
	{
		if(num%2==0)
		{
			System.out.println("The given number "+num+" is even");
		}
		else {
			System.out.println("The given number "+num+" is odd");
		}
		
		
	}
}