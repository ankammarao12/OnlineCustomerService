package com.dao;

import java.sql.SQLException;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Department;


public interface AdminDao extends JpaRepository<Department,Integer> {
	
}