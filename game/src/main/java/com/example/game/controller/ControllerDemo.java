package com.example.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.game.service.GameResultService;

@Controller
public class ControllerDemo {
	
	@Autowired
	GameResultService service;
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView  welcome() {
		ModelAndView view = new ModelAndView();
		view.addObject("results", service.getAll());
    	view.setViewName("home");
		return view;
	}
}
