package com.spring.demo.JpaRepositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.Authorities;
@Repository
public interface AuthoritiesRepository extends JpaRepository<Authorities, Integer> {

}
