package com.javatech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.javatech.dto.OrderResponse;
import com.javatech.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
//@Query("SELECT c.name, p.productName FROM CUSTOMER c, PRODUCT p where c.productName=p.productName")
@Query("SELECT new  com.javatech.dto.OrderResponse(c.name,p.productName )FROM CUSTOMER c JOIN  c.products p")
	public List<OrderResponse> getJoinInformation();
}
