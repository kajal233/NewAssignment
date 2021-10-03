package com.demo.controller;


import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.serviceimp.ProductServiceImpl;

@RestController
public class ProductController {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	//Injecting the dependencies of product implementation
	@Autowired
	ProductServiceImpl productServiceImpl;
	
	//Inserting product details like id ,name,manufacturer
	@PostMapping("/addproductdetails")
	ResponseEntity<Product> addProductDetails(@Validated @RequestBody Product product) {
		LOGGER.info("inside ProductController.addProductDetails() method");
		
		Product prod=productServiceImpl.addProduct(product);
		LOGGER.info("demo of logger"+prod.getCategory());
		
		return new  ResponseEntity<Product>(prod,HttpStatus.ACCEPTED);
	}
	
	//For fetching the record from the database
	@GetMapping("/getproductdetails")
	ArrayList<Product> getProductDetails() {
		ArrayList<Product> listofProduct=productServiceImpl.ListOfProducts();
		return listofProduct;
	}
	
	//For fetching the record from the database by id
	@GetMapping("/getproductbyid/{id}")
	Product getProductDetailsById(@PathVariable("id") Integer id) {
		Product productbyid=productServiceImpl.viewProductById(id);
		return productbyid;
	}
	
	//For updating record in the database
	@PutMapping("/updatedetails")
	Product updateProductsDetails(@RequestBody Product product) {
		
		return productServiceImpl.updateProduct(product);
	}
	
	
	//For updating record in the database by id
	@PutMapping("/updateProductDetails/{id}")
	Product updateProductDetails(@PathVariable("id") Integer id,@RequestBody Product product) {
		Product productupdate=productServiceImpl.updateOfProductById(id,product);
	    return productupdate;
	}
	
	//For delete the record from the database 
	@DeleteMapping("/deleteproductbyid/{id}")
	public void deleteProductById(@PathVariable("id") Integer id) {
		productServiceImpl.deleteProductById(id);
	}
	
}