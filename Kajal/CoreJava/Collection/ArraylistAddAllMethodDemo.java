package com.collections;

	import java.util.ArrayList;
	import java.util.Iterator;

	public class ArraylistAddAllMethodDemo {

		public static void main(String[] args) {

			// merging of two arrays
			ArrayList<String> arrlist1 = new ArrayList<String>();

			arrlist1.add("joyti");
			arrlist1.add("himansi");

			ArrayList<String> arrlist2 = new ArrayList<String>();

			arrlist2.add("ravi");
			arrlist2.add("ram");
			arrlist2.add("tom");
			arrlist2.add("jerey");
			arrlist2.add("ankit");

			arrlist2.addAll(arrlist1);

			Iterator itr = arrlist2.iterator();

			while (itr.hasNext()) {

				System.out.println("list is " + itr.next());

			}

		}

}
