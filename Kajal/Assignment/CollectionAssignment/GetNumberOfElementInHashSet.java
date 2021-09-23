package com.collectionAssignment;

import java.util.HashSet;

//Write a Java program to get the number of elements in a hash set.

public class GetNumberOfElementInHashSet {
	public static void main(String[] args) {
        // Create a empty hash set
    HashSet<String> h_set = new HashSet<String>();
  // use add() method to add values in the hash set
         h_set.add("Red");
         h_set.add("Green");
         h_set.add("Black");
         h_set.add("White");
         h_set.add("Pink");
         h_set.add("Yellow");
   System.out.println("Original Hash Set: " + h_set);
   System.out.println("Size of the Hash Set: " + h_set.size());
  }
}
