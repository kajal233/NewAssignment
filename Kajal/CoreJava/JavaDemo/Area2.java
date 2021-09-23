package Studentcom.demo;

import java.util.Scanner;

public class Area2 {
	
	    int length;
	    int breadth;
	    Area2(int a, int b)
	    {
	         length = a;
	         breadth = b;
	    }
	    public int areareturn()
	    {
	        return length * breadth;
	    }
		    public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);
	        int a,b;
	        System.out.println("Enter the lenght of Recatangle");
	         a = obj.nextInt();
	        obj.nextLine();
	        System.out.println("Enter the breadth of Recatangle");
	        b = obj.nextInt();
	        Area2 ob1 = new Area2(a,b);
	        System.out.println("Area = "+ ob1.areareturn());
	    }
	}
	 