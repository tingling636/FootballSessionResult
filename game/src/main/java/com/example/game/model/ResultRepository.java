package com.example.game.model;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends CrudRepository<GameResult, String>{
	
	@Query("SELECT r FROM GameResult r where r.homeTeam =:team")
    public Optional<GameResult> findByHomeTeam(@Param("team") String team);
}
