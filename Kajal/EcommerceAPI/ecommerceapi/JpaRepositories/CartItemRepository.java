package com.spring.demo.JpaRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.CartItem;
@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Integer>{

}
