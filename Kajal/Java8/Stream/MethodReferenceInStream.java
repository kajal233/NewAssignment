package com.stream;

//Method Reference in stream
import java.util.*;  
import java.util.stream.Collectors;  
  
class Product8{  
    int id;  
    String name;  
    float price;  
      
    public Product8(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
          
    public int getId() {  
        return id;  
    }  
    public String getName() {  
        return name;  
    }  
    public float getPrice() {  
        return price;  
    }  
}  
  
public class MethodReferenceInStream {
	
	public static void main(String[] args) {  
        
        List<Product8> productsList = new ArrayList<Product8>();  
          
        //Adding Products  
        productsList.add(new Product8(1,"HP Laptop",25000f));  
        productsList.add(new Product8(2,"Dell Laptop",30000f));  
        productsList.add(new Product8(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product8(4,"Sony Laptop",28000f));  
        productsList.add(new Product8(5,"Apple Laptop",90000f));  
          
        List<Float> productPriceList =   
                productsList.stream()  
                            .filter(p -> p.price > 30000) // filtering data  
                            .map(Product8::getPrice)         // fetching price by referring getPrice method  
                            .collect(Collectors.toList());  // collecting as list  
        System.out.println(productPriceList);  
    }  
}  


