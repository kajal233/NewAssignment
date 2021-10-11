package com.spring.demo.JpaRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.ShippingAddress;
@Repository
public interface ShippingAddressRepository extends JpaRepository<ShippingAddress, Integer>{

}
