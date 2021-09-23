package com.stringsdemo;

import java.util.StringTokenizer;

public class StringTokennizerDemo {

	public static void main(String ar[]) {

	  String s1 =" i_am_good_hello";
		
		StringTokenizer st = new StringTokenizer(s1,"_");// break the string on the basics of token(, # @ )
		
		

		while (st.hasMoreTokens()) {

			System.out.println(st.nextToken());
		}
	}

}
