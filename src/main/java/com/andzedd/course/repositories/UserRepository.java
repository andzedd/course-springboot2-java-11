package com.andzedd.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andzedd.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
