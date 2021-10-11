package com.spring.demo.service;

import java.util.ArrayList;

import com.spring.demo.model.BillingAddress;
import com.spring.demo.model.Product;

public interface BillingAddressService {

	//Add billing address
	BillingAddress addBillingAddresss(BillingAddress billingAddress);
	
	//List of Billing address
	ArrayList<BillingAddress> listOfBillingAddress();
	
	//Delete of Billing
	void deleteBillingAddressById(Integer id);
	
	//Update billing address
	BillingAddress updateBillingAddress(BillingAddress billingAddress);
	
}

