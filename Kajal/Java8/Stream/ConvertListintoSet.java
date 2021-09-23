package com.stream;

//Convert List into Set

import java.util.*;  
import java.util.stream.Collectors;  
class Product6{  
    int id;  
    String name;  
    float price;  
    public Product6(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
  

public class ConvertListintoSet {
	
	public static void main(String[] args) {  
        List<Product6> productsList = new ArrayList<Product6>();  
  
        //Adding Products  
        productsList.add(new Product6(1,"HP Laptop",25000f));  
        productsList.add(new Product6(2,"Dell Laptop",30000f));  
        productsList.add(new Product6(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product6(4,"Sony Laptop",28000f));  
        productsList.add(new Product6(5,"Apple Laptop",90000f));  
          
        // Converting product List into Set  
        Set<Float> productPriceList =   
            productsList.stream()  
            .filter(product->product.price < 30000)   // filter product on the base of price  
            .map(product->product.price)  
            .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
        System.out.println(productPriceList);  
    }  
}  

