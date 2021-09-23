package com.collectionAssignment;

import java.util.TreeSet;

//Write a Java program to iterate through all elements in a tree set.

public class IterateElementInTreeSet {
	public static void main(String[] args) {
		  TreeSet<String> tree_set = new TreeSet<String>();
		  tree_set.add("Red");
		  tree_set.add("Green");
		  tree_set.add("Orange");
		  tree_set.add("White");
		  tree_set.add("Black");
		  // Print the tree list
		  for (String element : tree_set) {
		    System.out.println(element);
		    }
	}
}
