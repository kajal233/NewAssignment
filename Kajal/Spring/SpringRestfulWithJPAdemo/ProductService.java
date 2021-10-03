package com.demo.service;


import java.util.ArrayList;

import com.demo.model.Product;

public interface ProductService {

	//add for product
	Product addProduct(Product product);
	
	//List of all products
	ArrayList<Product> ListOfProducts();
	
	//Delete of Product
	void deleteProductById(long id);
	
	//View particular Product by id
	Product viewProductById(long id);
	
	//Update of particular product by id
	Product updateOfProductById(long id,Product product);
	
	Product updateProduct(Product product);
	
}
