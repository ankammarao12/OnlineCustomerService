package com.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.model.Operator;

public interface OperatorDao extends JpaRepository<Operator,Integer>{
	
}
	