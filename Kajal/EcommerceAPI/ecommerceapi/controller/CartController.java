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

import com.spring.demo.model.Cart;
import com.spring.demo.serviceimpl.CartServiceImpl;

@RestController
public class CartController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CartServiceImpl cartServiceImpl;
	
	/**
	 * @param cart
	 * @return
	 */
	@PostMapping("/addcartdetails")
	ResponseEntity<Cart> addCartDetails(@Valid @RequestBody Cart cart) {
	LOGGER.info("inside CartController.addCartDetails() method");
	Cart cart2=cartServiceImpl.addCart(cart);
		return new  ResponseEntity<Cart>(cart2,HttpStatus.ACCEPTED);
	}
	
	/**
	 * @return
	 */
	@GetMapping("/getcartdetails")
	ArrayList<Cart> getCartDetails() {
		LOGGER.info("inside CartController.getCartDetails() method");
		ArrayList<Cart> listofcart=cartServiceImpl.listOfCart();
		return listofcart;
	}
	
	/**
	 * @param cart
	 * @return
	 */
	@PutMapping("/updatecartdetails")
	ResponseEntity<Cart> updateCartDetails(@Valid @RequestBody Cart cart) {
		LOGGER.info("inside CartController.updateCartDetails(Cart cart); method");
		Cart updateCart=cartServiceImpl.updateCart(cart);
		return new  ResponseEntity<Cart>(updateCart,HttpStatus.ACCEPTED);
	}


	/**
	 * @param id
	 */
	@DeleteMapping("/deletecartbyid/{id}")
	public void deleteCartById(@Valid @PathVariable("id") Integer id) {
		LOGGER.info("inside CartController.deleteCartById(id) method");
		cartServiceImpl.deleteCartById(id);
	}
}
