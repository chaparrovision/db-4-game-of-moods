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

import com.revature.start.scarlet.beans.Statements;
import com.revature.start.scarlet.services.StatementsService;
@CrossOrigin(origins = "", allowedHeaders = "", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
	       RequestMethod.DELETE })
@RestController
@RequestMapping("/statement")

public class StatementsController {
	@Autowired
	StatementsService statementservice;
	
	//CREATE
	@PostMapping
	public Statements createStatement(@RequestBody Statements statement) {
		return statementservice.createStatement(statement);
	}
	
	//READ
	@GetMapping
	public List<Statements> getStatement(){
		return statementservice.getStatement();
	}
}
