package com.spring.demo.JpaRepositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
