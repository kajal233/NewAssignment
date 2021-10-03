package com.demo.jparepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	Product findAllById(long id);

}
