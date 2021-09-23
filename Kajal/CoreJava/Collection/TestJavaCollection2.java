package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class TestJavaCollection2 {
	public static void main(String args[]){  
		LinkedList<String> al=new LinkedList<String>();  
		al.add("A");  
		al.add("B");  
		al.add("C");  
		al.add("D");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  

}
