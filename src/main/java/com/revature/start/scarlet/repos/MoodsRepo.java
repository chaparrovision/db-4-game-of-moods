package com.revature.start.scarlet.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.start.scarlet.beans.MoodsBean;

@Repository
public interface MoodsRepo extends JpaRepository<MoodsBean, Integer> {

}
