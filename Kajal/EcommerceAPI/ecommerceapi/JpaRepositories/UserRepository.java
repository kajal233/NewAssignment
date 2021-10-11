package com.spring.demo.JpaRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
