package com.demo1;
import java.util.*;
	 public class Grader {
	
	    public static void main (String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter the grade point: ");
	        double grd=sc.nextDouble();
	        
	        if(grd==5)
	        {
	            System.out.println("Grade: O");
	        }
	        else if(grd>=4.5)
	        {
	            System.out.println("Grade: E");
	        }
	        else if(grd>=4.0)
	        {
	            System.out.println("Grade: A");
	        }
	        else if(grd>=3.0)
	        {
	            System.out.println("Grade: B");
	        }
	        else if(grd>=2.0)
	        {
	            System.out.println("Grade: C");
	        }
	        
	        else
	        {
	            System.out.println("Grade: F");
	        }
	    }
	}
