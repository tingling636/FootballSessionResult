package com.example.game.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.game.model.GameResult;
import com.example.game.service.GameResultService;

@RestController 
@RequestMapping(path = "/results")
public class DemoRestController {
	@Autowired
	GameResultService service;
	
	@GetMapping(path="/", produces = "application/json")  
	public List<GameResult> getResults(){  
		return service.getAll();  
	}  
	
}
