package com.robertmovie.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robertmovie.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
}
