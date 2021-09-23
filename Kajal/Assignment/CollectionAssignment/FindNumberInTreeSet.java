package com.collectionAssignment;

import java.util.Iterator;
import java.util.TreeSet;

//Write a Java program to find the numbers less than 7 in a tree set.

public class FindNumberInTreeSet {
	
	public static void main(String[] args) {
		 // creating TreeSet 
		   TreeSet <Integer>tree_num = new TreeSet<Integer>();
		   TreeSet <Integer>treeheadset = new TreeSet<Integer>();
		     
		   // Add numbers in the tree
		   tree_num.add(1);
		   tree_num.add(2);
		   tree_num.add(3);
		   tree_num.add(5);
		   tree_num.add(6);
		   tree_num.add(7);
		   tree_num.add(8);
		   tree_num.add(9);
		   tree_num.add(10);
		     
		   // Find numbers less than 7
		 treeheadset = (TreeSet)tree_num.headSet(7);  

		   // create an iterator
		   Iterator iterator;
		   iterator = treeheadset.iterator();
		     
		   //Displaying the tree set data
		   System.out.println("Tree set data: ");     
		   while (iterator.hasNext()){
		   System.out.println(iterator.next() + " ");
		   }
		   }    

}
