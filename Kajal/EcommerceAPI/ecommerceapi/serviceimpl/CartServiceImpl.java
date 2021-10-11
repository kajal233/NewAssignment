package com.spring.demo.serviceimpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.JpaRepositories.CartRepository;
import com.spring.demo.model.Cart;
import com.spring.demo.service.CartService;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	CartRepository cartRepository;
	
	@Override
	public Cart addCart(Cart cart) {
		// TODO Auto-generated method stub
		Cart cart2=cartRepository.save(cart);
		return cart2;
	}

	@Override
	public ArrayList<Cart> listOfCart() {
		// TODO Auto-generated method stub
		ArrayList<Cart> listofcart=(ArrayList<Cart>) cartRepository.findAll();
		return listofcart;
	}

	@Override
	public Cart updateCart(Cart cart) {
		// TODO Auto-generated method stub
		Cart cart2=cartRepository.save(cart);
		return cart2;
	}

	@Override
	public void deleteCartById(Integer id) {
		// TODO Auto-generated method stub
		cartRepository.deleteById(id);
	}

}
