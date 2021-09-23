package com.java8.lambdaexp;
	interface Palindrome{
		int isPalindrome(int num);
	}
	public class PalindromeOperation {
		
		public static void main(String args[]) {
			
			Palindrome plindromenum=(num) ->{
				int temp=num;
				int sum=0,result;
				while(temp!=0) {
					sum=sum*10+(temp%10);
					temp=temp/10;
				}
				//if result ==0 then number is palindrome else number is not palindrome
				result=(num==sum)?0:1;
				return result;
			};
			int result=plindromenum.isPalindrome(98);
			System.out.println("The given number is : "+(result==0?"Palindrome":"Not Palindrome"));
		}

	}


