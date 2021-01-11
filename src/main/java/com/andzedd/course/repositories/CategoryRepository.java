package com.andzedd.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andzedd.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
