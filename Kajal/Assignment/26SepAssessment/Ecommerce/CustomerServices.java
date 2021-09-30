package com.ecommerce.services;


import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.databaseschema.Customer;
import com.hibernate.util.HibernateUtil;

public class CustomerServices {

static Session sessionObj;
	
	//Post request
	// Method to store data in  database business logic 
	public Integer addCustomer(String firstName, String lastName, String customerPhone) {
		
		Transaction transaction=null;
		Integer CustomerDetails=null;
		
		try {
			sessionObj=HibernateUtil.buildSessionFactory().openSession();
			transaction=sessionObj.beginTransaction();
			Customer customer=new Customer(firstName, lastName, customerPhone);// created the object of Customer class
			CustomerDetails=(Integer)sessionObj.save(customer);// save the object or insert the recording
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
		return CustomerDetails;
	}
	
	//Get Request
	public void listOfAllCustomers() {
		System.out.println("All the available Customers");
		Transaction transaction=null;
		try {
			sessionObj=HibernateUtil.buildSessionFactory().openSession();
			transaction=sessionObj.beginTransaction();
			//Retrieve logic
			
			List customers=sessionObj.createQuery("From Customer").list();
			Iterator<Customer> iterator=customers.iterator();
			while(iterator.hasNext()) {
				Customer customer1=iterator.next();
				System.out.println("Customer id : "+customer1.getCustomer_id());
				System.out.println("Customer Name : "+customer1.getFirstName()+" "+customer1.getLastName());
				System.out.println("Phone number : "+customer1.getCustomerPhone());
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
	public void updateCustomerDetails(int Customer_id,String mobilenumber) {
		Transaction transaction=null;
		
		try {
			sessionObj=HibernateUtil.buildSessionFactory().openSession();
			transaction=sessionObj.beginTransaction();
			
			//logic
			Customer customer=(Customer) sessionObj.get(Customer.class, Customer_id);
			customer.setCustomerPhone(mobilenumber);
			sessionObj.update(customer);;
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
	//Method for deleting the Customer 
	public void deleteCustomerById(Integer CustomerId) {
		
		System.out.println("*****deleting record from the database******");
		Transaction transaction=null;
		try {
			sessionObj=HibernateUtil.buildSessionFactory().openSession();
			transaction=sessionObj.beginTransaction();
			Customer customer=(Customer)sessionObj.get(Customer.class, CustomerId);
			sessionObj.delete(customer);// hibernate will form delete query automatically
			System.out.println("deleted sucessfully..."+customer.getCustomer_id());;
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