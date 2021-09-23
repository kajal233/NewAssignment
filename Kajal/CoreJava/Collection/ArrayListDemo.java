package com.collections;

	import java.util.ArrayList;
	import java.util.Iterator;

	public class ArrayListDemo {

		public static void main(String[] args) {

			ArrayList<String> arrlist = new ArrayList<String>();

			arrlist.add("ravi");
			arrlist.add("ram");
			arrlist.add("tom");
			arrlist.add("jerey");
			arrlist.add("ankit");

			Iterator itr = arrlist.iterator();

			while (itr.hasNext()) {

				System.out.println("list is " + itr.next());

			}

		}

	}

