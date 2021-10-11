package com.spring.demo.JpaRepositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.SalesOrder;
@Repository
public interface SalesOrderRepository extends JpaRepository<SalesOrder, Integer>{

}
