package com.spring.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import com.spring.demo.model.Product;

public interface ProductService {

	    //add for product
		Product addProduct(Product product);
		
		//List of all products
		ArrayList<Product> ListOfProducts();
		
		//Delete of Product
		void deleteProductById(Integer id);
		
		public Product updateProduct(Product product);
}
