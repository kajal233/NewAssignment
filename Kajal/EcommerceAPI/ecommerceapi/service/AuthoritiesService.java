package com.spring.demo.service;

import java.util.ArrayList;

import com.spring.demo.model.Authorities;

public interface AuthoritiesService {

	//Add authorities
	Authorities addAuthorities(Authorities authorities);
	
	//List of authorities
	ArrayList<Authorities> getListOfAuthories();
	
	//Update Authorities
	Authorities updateAuthorities(Authorities authorities);
	
	//Delete Authorities by id
	void deleteAuthoritiesById(Integer id);
	
}
