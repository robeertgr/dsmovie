package com.robertmovie.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robertmovie.dsmovie.entities.Score;
import com.robertmovie.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	
}
