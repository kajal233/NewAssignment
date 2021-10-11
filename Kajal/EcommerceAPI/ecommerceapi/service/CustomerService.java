package com.spring.demo.service;

import java.util.ArrayList;

import com.spring.demo.model.Customer;

public interface CustomerService {

	//Add customer
	Customer addCustomer(Customer customer);
	
	//List of customer
	ArrayList<Customer> getListOfCustomer();
	
	//Update customer
	Customer updateCustomer(Customer customer);
	
	//Delete customer
	void deleteCustomer(Integer id);
	
}
