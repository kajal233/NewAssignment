package com.collectionAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a Java program to sort a given array list.
public class SortArrayList {
	 public static void main(String[] args) {
		  // Create a list and add some colors to the list
		  List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  System.out.println("List before sort: "+list_Strings);
		  Collections.sort(list_Strings);
		  System.out.println("List after sort: "+list_Strings);    
		 }
		}


