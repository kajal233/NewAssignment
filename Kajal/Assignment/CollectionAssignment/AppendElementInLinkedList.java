package com.collectionAssignment;

import java.util.LinkedList;

//Write a Java program to append the specified element to the end of a linked list.

public class AppendElementInLinkedList {
	public static void main(String[] args) {
	     // create an empty linked list
	     LinkedList<String> l_list = new LinkedList<String>();
	   // use add() method to add values in the linked list
	          l_list.add("Red");
	          l_list.add("Green");
	          l_list.add("Black");
	          l_list.add("White");
	          l_list.add("Pink");
	          l_list.add("Yellow");
		
	   // print the list
	   System.out.println("The linked list: " + l_list);
	   }
}
