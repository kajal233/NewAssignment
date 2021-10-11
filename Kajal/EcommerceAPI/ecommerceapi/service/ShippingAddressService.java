package com.spring.demo.service;

import java.util.ArrayList;

import com.spring.demo.model.BillingAddress;
import com.spring.demo.model.ShippingAddress;

public interface ShippingAddressService {

	//Add Shipping Address
	ShippingAddress addShippingAddress(ShippingAddress shippingAddress);
	
	//List of Shipping Address
	ArrayList<ShippingAddress> listOfShippingAddress();

	//Update Shipping Address
	ShippingAddress updateShippingAddress(ShippingAddress shippingAddress);
	
	//Delete of ShippingAddress
	void deleteShippingAddress(Integer id);
	
	
}
