package com.stream;

//Filtering Collection without using Stream

import java.util.*;  
class Item{  
    int id;  
    String name;  
    float price;  
    public Item(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class FilteringCollectionwithoutusingStream {
	
	 public static void main(String[] args) {  
	        List<Item> productsList = new ArrayList<Item>();  
	        //Adding Products  
	        productsList.add(new Item(1,"HP Laptop",25000f));  
	        productsList.add(new Item(2,"Dell Laptop",30000f));  
	        productsList.add(new Item(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Item(4,"Sony Laptop",28000f));  
	        productsList.add(new Item(5,"Apple Laptop",90000f));  
	        List<Float> productPriceList = new ArrayList<Float>();  
	        for(Item product: productsList){  
	              
	            // filtering data of list  
	            if(product.price<30000){  
	                productPriceList.add(product.price);    // adding price to a productPriceList  
	            }  
	        }  
	        System.out.println(productPriceList);   // displaying data  
	    }  
	
}
