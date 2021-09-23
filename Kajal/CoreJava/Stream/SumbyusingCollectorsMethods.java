package com.stream;

//Sum by using Collectors Methods

import java.util.*;  
import java.util.stream.Collectors;  
class Cost{  
    int id;  
    String name;  
    float price;  
    public Cost(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class SumbyusingCollectorsMethods {
	
	public static void main(String[] args) {  
        List<Cost> productsList = new ArrayList<Cost>();  
        //Adding Products  
        productsList.add(new Cost(1,"HP Laptop",25000f));  
        productsList.add(new Cost(2,"Dell Laptop",30000f));  
        productsList.add(new Cost(3,"Lenevo Laptop",28000f));  
        productsList.add(new Cost(4,"Sony Laptop",28000f));  
        productsList.add(new Cost(5,"Apple Laptop",90000f));  
        // Using Collectors's method to sum the prices.  
        double totalPrice3 = productsList.stream()  
                        .collect(Collectors.summingDouble(product->product.price));  
        System.out.println(totalPrice3);  
          
    }  
}  



