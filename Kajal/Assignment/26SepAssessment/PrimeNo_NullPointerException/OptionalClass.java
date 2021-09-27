package com.assignment;
//Use Optional class and avoid NullPointerException from the below code
//String names[] = new String[5];
//System.out.print(names[0].length( ));

import java.util.Optional;

public class OptionalClass {

	public static void main(String args[]) {
		String names[] = new String[5];
		Optional<String> checkNull=Optional.ofNullable(names[4]);
		if(checkNull.isPresent()) {
			System.out.print(names[0].length());
		}
		else {
			System.out.println("Empty String");
		}

	}
}