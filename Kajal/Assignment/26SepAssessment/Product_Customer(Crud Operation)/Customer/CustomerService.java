package com.hibernate.service;


import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.Customer;
import com.hibernate.util.HibernateUtil;

public class CustomerService {

	static SessionFactory sessionFactoryObj;
	static Session sessionObj;

	//////////////// POST request//////////////////////////////////////////

	/* Method to CREATE an customer in the database business logic */
	public Integer addCustomer(String customername, String customeraddress, int mobileno) {

		Transaction tx = null;
		Integer customerID = null;

		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();

			Customer customer  = new Customer(customername, customeraddress,mobileno);// created the object of customer class
			customerID = (Integer) sessionObj.save(customer); // save the object or insert the recording

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}
		return customerID;
	}

	//////////////// GET request//////////////////////////////////////////

	// list

	/* Method to CREATE an product in the database business logic */
	public void ListAllCustometer() {
		System.out.println(" *************from inside  ListAllCustomer()**********************  ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			// retrive logic
			List customers = sessionObj.createQuery("From Customer").list(); // select * from customer: "Customer refer
																				//Customer class
			Iterator iterator = customers.iterator();
			while (iterator.hasNext()) {
				Customer customer1  = (Customer) iterator.next();
				System.out.println("customer name  " + customer1.getCustomerName());
				System.out.println("customer address    " + customer1.getCustomerAddress());
				System.out.println("mobileno  " + customer1.getMobileno());
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

	/* Method to update an Customer in the database business logic */
	public void updateCustomerDetails(Integer CustomerId, int mobileno) {
		System.out.println(" *************from inside  updateCustomerDetails()**********************  ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			// update logic

			Customer customer  = (Customer) sessionObj.get(Customer.class, CustomerId);

			customer.setMobileno(mobileno);

			sessionObj.update(customer);// hibernate will form update query automatically

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

	/* Method to update an Customer in the database business logic */
	public void deleteCustomerDetailsById(Integer CustomerId, int mobileno) {
		System.out.println(" *************from inside  deleteCustomerDetailsById()**********************  ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
//update logic

			Customer customer  = (Customer) sessionObj.get(Customer.class, CustomerId);

			customer.setMobileno(mobileno);

			sessionObj.delete(customer);// hibernate will form delete query automatically

			System.out.println("deleted sucessfully..."+customer.getId());

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
