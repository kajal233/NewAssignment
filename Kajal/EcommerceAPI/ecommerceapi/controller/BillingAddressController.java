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

import com.spring.demo.model.BillingAddress;
import com.spring.demo.serviceimpl.BillingAddressServiceImpl;

@RestController
public class BillingAddressController {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	BillingAddressServiceImpl billingAddressServiceImpl;
	
	/**
	 * @param billingAddress
	 * @return
	 */
	@PostMapping("/addbilladdress")
	ResponseEntity<BillingAddress> addBillingAddressDetails(@Valid @RequestBody BillingAddress billingAddress) {
		LOGGER.info("inside BillingAddressController.addBillingAddressDetails() method");
		BillingAddress billingAddress2=billingAddressServiceImpl.addBillingAddresss(billingAddress);
		return new  ResponseEntity<BillingAddress>(billingAddress2,HttpStatus.ACCEPTED);
	}
	
	/**
	 * @return
	 */
	@GetMapping("/getbilladdress")
	ArrayList<BillingAddress> getBillingAddressDetails() {
		LOGGER.info("inside BillingAddressController.getBillingAddressDetails() method");
		ArrayList<BillingAddress> listofbillingaddress=billingAddressServiceImpl.listOfBillingAddress();
		return listofbillingaddress;
	}
	
	/**
	 * @param billingAddress
	 * @return
	 */
	@PutMapping("/updatebilladdress")
	ResponseEntity<BillingAddress> updateBillingAddressDetails(@Valid @RequestBody BillingAddress billingAddress) {
		LOGGER.info("inside BillingAddressController.updateBillingAddressDetails(User user); method");
		BillingAddress updateBillingAddress=billingAddressServiceImpl.updateBillingAddress(billingAddress);
		return new  ResponseEntity<BillingAddress>(updateBillingAddress,HttpStatus.ACCEPTED);
	}
	
	/**
	 * @param id
	 */
	@DeleteMapping("/deletebilladdressbyid/{id}")
	public void deleteBillingAddressById(@Valid @PathVariable("id") Integer id) {
		LOGGER.info("inside BillingAddressController.deleteBillingAddressById(id) method");
		billingAddressServiceImpl.deleteBillingAddressById(id);
	}
}
