package com.collections;

	import java.util.Iterator;
	import java.util.LinkedList;


	public class ListLinkDemo {

		public static void main(String[] args) {

			LinkedList<String> arrlist2 = new LinkedList<String>(); // linked list demo

			arrlist2.add("ravi");
			arrlist2.add("ram");
			arrlist2.add("tom");
			arrlist2.add("jerey");
			arrlist2.add("ankit");

			Iterator itr = arrlist2.iterator();

			while (itr.hasNext()) {

				System.out.println("list is " + itr.next());

			}

		}

	}


