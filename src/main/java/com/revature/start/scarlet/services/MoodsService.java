package com.revature.start.scarlet.services;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.revature.start.scarlet.beans.MoodsBean;
import com.revature.start.scarlet.repos.MoodsRepo;

@Service
public class MoodsService {
	@Autowired
	EntityManager em;
	
	MoodsRepo mr;
	
	public MoodsService(MoodsRepo mr) {
		super();
		this.mr = mr;
	}
	public MoodsBean createMood(MoodsBean m) {
		return mr.save(m);
	}
	
	@Transactional(propagation = Propagation.NEVER)
	public List<MoodsBean> getMood(){
		return mr.findAll();
	}
	
}
