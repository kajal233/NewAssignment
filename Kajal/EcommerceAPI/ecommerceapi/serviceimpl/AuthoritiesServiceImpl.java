package com.spring.demo.serviceimpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.JpaRepositories.AuthoritiesRepository;
import com.spring.demo.model.Authorities;
import com.spring.demo.service.AuthoritiesService;
@Service
public class AuthoritiesServiceImpl implements AuthoritiesService{

	@Autowired
	AuthoritiesRepository  authoritiesRepository;
	
	@Override
	public Authorities addAuthorities(Authorities authorities) {
		// TODO Auto-generated method stub
		Authorities addauthority=authoritiesRepository.save(authorities);
		return addauthority;
	}

	@Override
	public ArrayList<Authorities> getListOfAuthories() {
		// TODO Auto-generated method stub
		ArrayList<Authorities> listofauthority=(ArrayList<Authorities>) authoritiesRepository.findAll();
		return listofauthority;
	}

	@Override
	public Authorities updateAuthorities(Authorities authorities) {
		// TODO Auto-generated method stub
		Authorities updateAuthority=authoritiesRepository.save(authorities);
		return updateAuthority;
	}

	@Override
	public void deleteAuthoritiesById(Integer id) {
		// TODO Auto-generated method stub
		authoritiesRepository.deleteById(id);
	}

}
