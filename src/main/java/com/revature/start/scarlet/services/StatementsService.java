package com.revature.start.scarlet.services;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.revature.start.scarlet.beans.MoodsBean;
import com.revature.start.scarlet.beans.Statements;
import com.revature.start.scarlet.repos.StatementsRepo;

@Service
public class StatementsService {
	@Autowired
	EntityManager em;
	
	StatementsRepo sr;
	
	public StatementsService(StatementsRepo sr) {
		super();
		this.sr = sr;
	}
	public Statements createStatement(Statements s) {
		return sr.save(s);
	}
	
	@Transactional(propagation = Propagation.NEVER)
	public List<Statements> getStatement(){
		return sr.findAll();
	}
}
