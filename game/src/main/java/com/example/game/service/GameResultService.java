package com.example.game.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.game.model.GameResult;
import com.example.game.model.ResultRepository;

@Service
public class GameResultService {
	@Autowired
	private ResultRepository resultRep;

	public List<GameResult> getAll() {
		List<GameResult> result = new ArrayList<>();
		resultRep.findAll().forEach(result::add);

		return result;
	}

	public Optional<GameResult> get(String id) {
		return resultRep.findById(id);
	}
	
	public Optional<GameResult> getTeamResult(String team){
		return resultRep.findByHomeTeam(team);
	}
}
