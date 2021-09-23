package com.stream;

// Convert List into Map

import java.util.*;  
import java.util.stream.Collectors;  
class Product7{  
    int id;  
    String name;  
    float price;  
    public Product7(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class ConvertListintoMap {
	
	public static void main(String[] args) {  
        List<Product7> productsList = new ArrayList<Product7>();  
  
        //Adding Products  
        productsList.add(new Product7(1,"HP Laptop",25000f));  
        productsList.add(new Product7(2,"Dell Laptop",30000f));  
        productsList.add(new Product7(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product7(4,"Sony Laptop",28000f));  
        productsList.add(new Product7(5,"Apple Laptop",90000f));  
          
        // Converting Product List into a Map  
        Map<Integer,String> productPriceMap =   
            productsList.stream()  
                        .collect(Collectors.toMap(p->p.id, p->p.name));  
              
        System.out.println(productPriceMap);  
    }  
}  
	
	


