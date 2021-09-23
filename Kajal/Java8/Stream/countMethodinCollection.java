package com.stream;

// count() Method in Collection

import java.util.*;  
class Product5{  
    int id;  
    String name;  
    float price;  
    public Product5(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class countMethodinCollection {
	
	public static void main(String[] args) {  
        List<Product5> productsList = new ArrayList<Product5>();  
        //Adding Products  
        productsList.add(new Product5(1,"HP Laptop",25000f));  
        productsList.add(new Product5(2,"Dell Laptop",30000f));  
        productsList.add(new Product5(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product5(4,"Sony Laptop",28000f));  
        productsList.add(new Product5(5,"Apple Laptop",90000f));  
        // count number of products based on the filter  
        long count = productsList.stream()  
                    .filter(product->product.price<30000)  
                    .count();  
        System.out.println(count);  
    }  
}  
	
	


