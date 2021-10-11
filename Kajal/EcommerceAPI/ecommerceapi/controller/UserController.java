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

import com.spring.demo.model.User;
import com.spring.demo.serviceimpl.UserServiceImpl;

@RestController
public class UserController {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserServiceImpl userServiceImpl;
	
	/**
	 * @param user
	 * @return
	 */
	@PostMapping("/adduserdetails")
	ResponseEntity<User> addUserDetails(@Valid @RequestBody User user) {
		LOGGER.info("inside UserController.addUserDetails() method");
		User user2=userServiceImpl.addUser(user);
		return new  ResponseEntity<User>(user2,HttpStatus.ACCEPTED);
	}
	
	/**
	 * @return
	 */
	@GetMapping("/getuserdetails")
	ArrayList<User> getUserDetails() {
		LOGGER.info("inside UserController.getUserDetails() method");
		ArrayList<User> listofUser=userServiceImpl.listOfUser();
		return listofUser;
	}
	
	/**
	 * @param user
	 * @return
	 */
	@PutMapping("/updateuserdetails")
	ResponseEntity<User> updateUserDetails(@Valid @RequestBody User user) {
		LOGGER.info("inside UserController.updateUserDetails(User user); method");
		User updateuser=userServiceImpl.updateUser(user);
		return new  ResponseEntity<User>(updateuser,HttpStatus.ACCEPTED);
	}
	
	/**
	 * @param id
	 */
	@DeleteMapping("/deleteuserbyid/{id}")
	public void deleteUserById(@Valid @PathVariable("id") Integer id) {
		LOGGER.info("inside UserController.deleteUserById(id) method");
		userServiceImpl.deleteUserById(id);
	}
}
