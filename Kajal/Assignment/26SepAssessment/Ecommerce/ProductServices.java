package com.ecommerce.services;


import com.databaseschema.Product;
import com.hibernate.util.*;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class ProductServices {

	static Session sessionObj;
	
	//Post request
	// Method to store data in  database business logic 
	public Integer addProduct(String category, String description, String name, double price, Integer unit) {
		
		Transaction transaction=null;
		Integer productDetails=null;
		
		try {
			sessionObj=HibernateUtil.buildSessionFactory().openSession();
			transaction=sessionObj.beginTransaction();
			Product product=new Product(category, description, name, price, unit);// created the object of product class
			productDetails=(Integer)sessionObj.save(product);// save the object or insert the recording
			transaction.commit();// Explicitly call the commit ensure that auto commit should be false
			
		}
		catch(HibernateException e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		finally {
			sessionObj.close();
		}
		return productDetails;
	}
	
	//Get Request
	public void listOfAllProducts() {
		System.out.println("All products");
		Transaction transaction=null;
		try {
			sessionObj=HibernateUtil.buildSessionFactory().openSession();
			transaction=sessionObj.beginTransaction();
			//Retrieve logic
			
			List products=sessionObj.createQuery("From Product").list();
			Iterator<Product> iterator=products.iterator();
			while(iterator.hasNext()) {
				Product product1=iterator.next();
				System.out.println("Product id : "+product1.getProduct_id());
				System.out.println("Product Category : "+product1.getCategory());
				System.out.println("Description : "+product1.getDescription());
				System.out.println("Product name : "+product1.getName());
				System.out.println("Product price : "+product1.getPrice());
				System.out.println("Product unit : "+product1.getUnit());
			}
			transaction.commit();
		}
	    catch(HibernateException e) {
	    	if(transaction!=null) {
	    		transaction.rollback();
	    	}
	    	e.printStackTrace();
	    }
		finally {
			sessionObj.close();
		}
	}
	
	//PUT request
	//Method for updating the records in the database
	public void updateProductDetails(int product_id,double price) {
		Transaction transaction=null;
		
		try {
			sessionObj=HibernateUtil.buildSessionFactory().openSession();
			transaction=sessionObj.beginTransaction();
			
			//logic
			Product product=(Product) sessionObj.get(Product.class, product_id);
			product.setPrice(price);
			sessionObj.update(product);;
			System.out.println("Updated");
			transaction.commit();
		}
		catch(HibernateException e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
			
		}
		finally {
		sessionObj.close();	
		}
	}
	
	//Delete Request
	//Method for deleting the product 
	public void deleteProductById(Integer productId) {
		
		System.out.println("***deleting record from the database******");
		Transaction transaction=null;
		try {
			sessionObj=HibernateUtil.buildSessionFactory().openSession();
			transaction=sessionObj.beginTransaction();
			Product product=(Product)sessionObj.get(Product.class, productId);
			sessionObj.delete(product);// hibernate will form delete query automatically
			System.out.println("deleted sucessfully..."+product.getProduct_id());;
            transaction.commit();// Explicitly call the commit ensure that auto commit should be false                
			
		}
		catch(HibernateException e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		finally {
			sessionObj.close();
		}
		
		
	}

}
