package com.stream;

//Filtering and Iterating Collection

import java.util.*;  
class Product1{  
    int id;  
    String name;  
    float price;  
    public Product1(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class FilteringandIteratingCollection {
	
	public static void main(String[] args) {  
        List<Product1> productsList = new ArrayList<Product1>();  
        //Adding Products  
        productsList.add(new Product1(1,"HP Laptop",25000f));  
        productsList.add(new Product1(2,"Dell Laptop",30000f));  
        productsList.add(new Product1(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product1(4,"Sony Laptop",28000f));  
        productsList.add(new Product1(5,"Apple Laptop",90000f));  
        // This is more compact approach for filtering data  
        productsList.stream()  
                             .filter(product -> product.price == 30000)  
                             .forEach(product -> System.out.println(product.name));    
    }  
}  

