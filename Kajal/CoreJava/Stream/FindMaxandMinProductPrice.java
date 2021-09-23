package com.stream;

//Find Max and Minimum Product Price
// finds minimum and max product price by using stream. 
//It provides convenient way to find values without using imperative approach.

import java.util.*;    
class Cost1{    
    int id;    
    String name;    
    float price;    
    public Cost1(int id, String name, float price) {    
        this.id = id;    
        this.name = name;    
        this.price = price;    
    }    
}    

public class FindMaxandMinProductPrice {

	 public static void main(String[] args) {    
	        List<Product> productsList = new ArrayList<Product>();    
	        //Adding Products    
	        productsList.add(new Product(1,"HP Laptop",25000f));    
	        productsList.add(new Product(2,"Dell Laptop",30000f));    
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));    
	        productsList.add(new Product(4,"Sony Laptop",28000f));    
	        productsList.add(new Product(5,"Apple Laptop",90000f));    
	        // max() method to get max Product price     
	        Product productA = productsList.stream().max((product1, product2)->product1.price > product2.price ? 1: -1).get();    
	        System.out.println(productA.price);    
	        // min() method to get min Product price    
	        Product productB = productsList.stream().min((product1, product2)->product1.price > product2.price ? 1: -1).get();    
	        System.out.println(productB.price);    
	            
	    }    
	}    

