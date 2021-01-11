package com.andzedd.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andzedd.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
