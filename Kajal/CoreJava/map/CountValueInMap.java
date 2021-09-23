package com.map;

import java.util.HashMap;

//Write a Java program to count the number of key-value (size) mappings in a map.


public class CountValueInMap {

	public static void main(String args[]){  
		  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  hash_map.put(1, "Red");
		  hash_map.put(2, "Green");
		  hash_map.put(3, "Black");
		  hash_map.put(4, "White");
		  hash_map.put(5, "Blue");
		  System.out.println("Size of the hash map: "+hash_map.size());
		 }
}
