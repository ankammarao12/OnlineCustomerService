package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Issue;

public interface IssueDao extends JpaRepository<Issue,Integer> {

}
