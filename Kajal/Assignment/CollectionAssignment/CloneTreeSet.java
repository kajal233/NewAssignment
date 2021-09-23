package com.collectionAssignment;

import java.util.TreeSet;

//Write a Java program to clone a tree set list to another tree set

public class CloneTreeSet {

	public static void main(String[] args) {
	    // create an empty tree set
	     TreeSet<String> t_set = new TreeSet<String>();
	   // use add() method to add values in the tree set
	          t_set.add("Red");
	          t_set.add("Green");
	          t_set.add("Black");
	          t_set.add("Pink");
	          t_set.add("orange");
	     
	   System.out.println("Original tree set:" + t_set);  
	    TreeSet<String> new_t_set = (TreeSet<String>)t_set.clone();
	          System.out.println("Cloned tree list: " + t_set);      
	     }
	 }
