package com.robertmovie.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robertmovie.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
	
}
