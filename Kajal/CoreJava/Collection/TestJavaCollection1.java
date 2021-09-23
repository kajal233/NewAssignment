package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestJavaCollection1 {
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();//Creating array list  
		list.add("A");//Adding object in array list  
		list.add("B");  
		list.add("C");  
		list.add("D");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		
}
