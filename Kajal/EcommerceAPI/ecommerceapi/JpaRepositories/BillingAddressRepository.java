package com.spring.demo.JpaRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.BillingAddress;
@Repository
public interface BillingAddressRepository extends JpaRepository<BillingAddress, Integer> {

}