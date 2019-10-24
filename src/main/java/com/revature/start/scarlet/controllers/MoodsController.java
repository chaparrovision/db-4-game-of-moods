package com.revature.start.scarlet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.start.scarlet.beans.MoodsBean;
import com.revature.start.scarlet.services.MoodsService;

@RestController
@RequestMapping("/mood")
@CrossOrigin(origins = "", allowedHeaders = "", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
	       RequestMethod.DELETE })
public class MoodsController {
	@Autowired
	MoodsService moodservice;
	
	//CREATE
	@PostMapping
	public MoodsBean createMood(@RequestBody MoodsBean mood) {
		return moodservice.createMood(mood);
	}
	
	//READ
	@GetMapping
	public List<MoodsBean> getMood(){
		return moodservice.getMood();
	}
}
