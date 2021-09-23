package com.collections;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.List;

	public class ArrayListAndLinkListDemo {

		public static void main(String[] args) {

			// merging of two arrays
			List<String> list1 = new LinkedList<String>(); //linked list

			list1.add("joyti");
			list1.add("himansi");

			ArrayList<String> arrlist2 = new ArrayList<String>();

			arrlist2.add("ravi");
			arrlist2.add("ram");
			arrlist2.add("tom");
			arrlist2.add("jerey");
			arrlist2.add("ankit");

			arrlist2.addAll(list1);

			Iterator itr = arrlist2.iterator();

			while (itr.hasNext()) {

				System.out.println("list is " + itr.next());

			}

		}

	}
	