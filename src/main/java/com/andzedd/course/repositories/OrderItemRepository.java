package com.andzedd.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andzedd.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
