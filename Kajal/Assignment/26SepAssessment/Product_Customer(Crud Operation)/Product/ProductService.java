package com.hibernate.service;


import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.Product;
import com.hibernate.util.HibernateUtil;
;

public class ProductService {

	static SessionFactory sessionFactoryObj;
	static Session sessionObj;

	//////////////// POST request//////////////////////////////////////////

	/* Method to CREATE an product in the database business logic */
	public Integer addProduct(String productname, String productcategory, int price) {

		Transaction tx = null;
		Integer productID = null;

		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();

			Product product = new Product(productname, productcategory,price);// created the object of product class
			productID = (Integer) sessionObj.save(product); // save the object or insert the recording

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}
		return productID;
	}

	//////////////// GET request//////////////////////////////////////////

	// list

	/* Method to CREATE an product in the database business logic */
	public void ListAllProduct() {
		System.out.println(" *************from inside  ListAllProduct()**********************  ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			// retrive logic
			List products = sessionObj.createQuery("From Product").list(); // select * from product: "Product refer
																				//Product class
			Iterator iterator = products.iterator();
			while (iterator.hasNext()) {
				Product product1 = (Product) iterator.next();
				System.out.println("product  name  " + product1.getProductName());
				System.out.println("product  category  " + product1.getProductCategory());
				System.out.println("price    " + product1.getPrice());
			}

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (

		HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}
	}

// update

////////////////PUT request   id//////////////////////////////////////////

	/* Method to update an Product in the database business logic */
	public void updateProductDetails(Integer ProductId, int price) {
		System.out.println(" *************from inside  updateProductDetails()**********************  ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			// update logic

			Product product = (Product) sessionObj.get(Product.class, ProductId);

			product.setPrice(price);

			sessionObj.update(product);// hibernate will form update query automatically

			System.out.println("update sucessfully...");

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (

		HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}

	}

// delete

////////////////PUT request   id//////////////////////////////////////////

	/* Method to update an employee in the database business logic */
	public void deleteProductDetailsById(Integer ProductId, int price) {
		System.out.println(" *************from inside  deleteProductDetailsById()**********************  ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
//update logic

			Product product = (Product) sessionObj.get(Product.class, ProductId);

			product.setPrice(price);

			sessionObj.delete(product);// hibernate will form delete query automatically

			System.out.println("deleted sucessfully..."+product.getId());

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (

		HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}

	}

}
