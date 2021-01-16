package com.example.registrationproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.registrationproduct.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
