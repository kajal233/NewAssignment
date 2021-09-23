package com.map;

import java.util.PriorityQueue;

//Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue.

public class CreatePriorityQueue {
	public static void main(String[] args) {
		  PriorityQueue<String> queue=new PriorityQueue<String>();  
		  queue.add("Red");
		  queue.add("Green");
		  queue.add("Orange");
		  queue.add("White");
		  queue.add("Black");
		  System.out.println("Elements of the Priority Queue: ");
		  System.out.println(queue);
		 }
		}
	