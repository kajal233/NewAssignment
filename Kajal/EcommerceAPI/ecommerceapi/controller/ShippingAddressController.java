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

import com.spring.demo.model.ShippingAddress;
import com.spring.demo.serviceimpl.ShippingAddressServiceImpl;

/**
 * @author kajal.raj
 *
 */
@RestController
public class ShippingAddressController {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ShippingAddressServiceImpl shippingAddressServiceImpl;
	
	/**
	 * @param shippingAddress
	 * @return
	 */
	@PostMapping("/addshippingaddress")
	ResponseEntity<ShippingAddress> addShippingAddressDetails(@Valid @RequestBody ShippingAddress shippingAddress) {
	LOGGER.info("inside ShippingAddressController.addShippingAddressDetails() method");
	ShippingAddress shippingAddress2=shippingAddressServiceImpl.addShippingAddress(shippingAddress);
		return new  ResponseEntity<ShippingAddress>(shippingAddress2,HttpStatus.ACCEPTED);
	}
	
	/**
	 * @return
	 */
	@GetMapping("/getshippingaddress")
	ArrayList<ShippingAddress> getShippingAddressDetails() {
		LOGGER.info("inside ShippingAddressController.getShippingAddressDetails() method");
		ArrayList<ShippingAddress> listofshippingaddress=shippingAddressServiceImpl.listOfShippingAddress();
		return listofshippingaddress;
	}

	/**
	 * @param id
	 */
	@DeleteMapping("/deleteshippingaddressbyid/{id}")
	public void deleteShippingAddressById(@Valid @PathVariable("id") Integer id) {
		LOGGER.info("inside ShippingAddressController.deleteShippingAddressById(id) method");
		shippingAddressServiceImpl.deleteShippingAddress(id);		
	}
	
	/**
	 * @param shippingAddress
	 * @return
	 */
	@PutMapping("/updateshippingaddress")
	ResponseEntity<ShippingAddress> updateShippingAddressDetails(@Valid @RequestBody ShippingAddress shippingAddress) {
		LOGGER.info("inside ShippingAddressController.updateShippingAddressDetails(ShippingAddress shippingAddress); method");
		ShippingAddress updateshippingaddress=shippingAddressServiceImpl.updateShippingAddress(shippingAddress);
		return new  ResponseEntity<ShippingAddress>(updateshippingaddress,HttpStatus.ACCEPTED);
	}
}
