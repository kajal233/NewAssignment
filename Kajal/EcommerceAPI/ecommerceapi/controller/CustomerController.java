package com.spring.demo.controller;
import java.util.ArrayList;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.model.Customer;
import com.spring.demo.serviceimpl.CustomerServiceImpl;


/**
 * @author kajal.raj
 *
 */
@RestController
public class CustomerController {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CustomerServiceImpl customerServiceImpl;
	
	/**
	 * @param customer
	 * @return
	 */
	@PostMapping("/addcustomerdtails")
	ResponseEntity<Customer> addCustomerDetails(@Valid @RequestBody Customer customer) {
	LOGGER.info("inside CustomerController.addCustomerDetails() method");
	Customer customer2=customerServiceImpl.addCustomer(customer);
		return new  ResponseEntity<Customer>(customer2,HttpStatus.ACCEPTED);
	}
	
	/**
	 * @return
	 */
	@GetMapping("/getcustomerdetails")
	ArrayList<Customer> getCustomerDetails() {
		LOGGER.info("inside CustomerController.getCustomerDetails() method");
		ArrayList<Customer> listofcustomer=customerServiceImpl.getListOfCustomer();
		return listofcustomer;
	}
	
	/**
	 * @param customer
	 * @return
	 */
	@PutMapping("/updatecustomerdetails")
	ResponseEntity<Customer> updateCustomerDetails(@Valid @RequestBody Customer customer) {
		LOGGER.info("inside customerController.updatecustomerDetails(Customer customer); method");
		Customer updatecustomer=customerServiceImpl.updateCustomer(customer);
		return new  ResponseEntity<Customer>(updatecustomer,HttpStatus.ACCEPTED);
	}

	/**
	 * @param id
	 */
	@DeleteMapping("/deletecustomerbyid/{id}")
	public void deleteCustomerById(@Valid @PathVariable("id") Integer id) {
		LOGGER.info("inside customerController.deleteCustomerById(id) method");
		customerServiceImpl.deleteCustomer(id);
	}
}
