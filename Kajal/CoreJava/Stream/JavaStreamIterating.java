package com.stream;

import java.util.stream.Stream;

//stream is used to iterate any number of times. 
//Stream provides predefined methods to deal with the logic you implement. 

public class JavaStreamIterating {
	
	  public static void main(String[] args){  
	        Stream.iterate(1, element->element+1)  
	        .filter(element->element%5==0)  
	        .limit(5)  
	        .forEach(System.out::println);  
	    }  

}
