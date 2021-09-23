package com.collections;
	import java.util.List;
	import java.util.Vector;

	//Vector is synchronized.
	//Java Vector contains many legacy methods that are not the part of a collections framework.
	public class VectorDemo {

		public static void main(String ar[]) {
			
			List<String> vect= new Vector<String>();
			
					vect.add("ravi");
					vect.add("ram");
					vect.add("tom");
					vect.add("jerey");
					vect.add("ankit");
					
					System.out.println(vect);
			
			
		}
	}
	