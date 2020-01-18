package com.javatech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatech.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
