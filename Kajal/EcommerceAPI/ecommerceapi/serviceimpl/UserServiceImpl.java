package com.spring.demo.serviceimpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.JpaRepositories.UserRepository;
import com.spring.demo.model.User;
import com.spring.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		User user2=userRepository.save(user);
		return user2;
	}

	@Override
	public ArrayList<User> listOfUser() {
		// TODO Auto-generated method stub
		ArrayList<User> userlist=(ArrayList<User>) userRepository.findAll();
		return userlist;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		User user2=userRepository.save(user);
		return user2;
	}

	@Override
	public void deleteUserById(Integer id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);	
	}

}
