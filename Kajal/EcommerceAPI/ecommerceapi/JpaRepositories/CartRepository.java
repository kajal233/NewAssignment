package com.spring.demo.JpaRepositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.Cart;
@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>
{
	
}