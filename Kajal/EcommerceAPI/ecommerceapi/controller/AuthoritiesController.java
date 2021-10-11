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

import com.spring.demo.model.Authorities;
import com.spring.demo.serviceimpl.AuthoritiesServiceImpl;

@RestController
public class AuthoritiesController {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	AuthoritiesServiceImpl authoritiesServiceImpl;
	
	/**
	 * @param authorities
	 * @return
	 */
	@PostMapping("/addauthorities")
	ResponseEntity<Authorities> addAuthoritiesDetails(@Valid @RequestBody Authorities authorities) {
	LOGGER.info("inside AuthoritiesController.addAuthoritiesDetails() method");
	Authorities addauthorities=authoritiesServiceImpl.addAuthorities(authorities);
		return new  ResponseEntity<Authorities>(addauthorities,HttpStatus.ACCEPTED);
	}
	
	/**
	 * @return
	 */
	@GetMapping("/getauthoritieslist")
	ArrayList<Authorities> getAuthoritiesDetails() {
		LOGGER.info("inside AuthoritiesController.getAuthoritiesDetails() method");
		ArrayList<Authorities> listofauthorities=authoritiesServiceImpl.getListOfAuthories();
		return listofauthorities;
	}
	
	/**
	 * @param authorities
	 * @return
	 */
	@PutMapping("/updateauthorities")
	ResponseEntity<Authorities> updateAuthoritiesDetails(@Valid @RequestBody Authorities authorities) {
		LOGGER.info("inside AuthoritiesController.updateAuthoritiesDetails(Authorities authorities); method");
		Authorities updateuthorities=authoritiesServiceImpl.updateAuthorities(authorities);
		return new  ResponseEntity<Authorities>(updateuthorities,HttpStatus.ACCEPTED);
	}

	/**
	 * @param id
	 */
	@DeleteMapping("/deleteauthoritiesbyid/{id}")
	public void deleteAuthoritiesById(@Valid @PathVariable("id") Integer id) {
		LOGGER.info("inside AuthoritiesController.deleteAuthoritiesById(id) method");
		authoritiesServiceImpl.deleteAuthoritiesById(id);
	}
}
