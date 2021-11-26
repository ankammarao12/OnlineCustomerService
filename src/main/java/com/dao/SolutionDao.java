package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Solution;
@Repository
public interface SolutionDao extends JpaRepository<Solution, Integer> {

}