package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Login;

public interface LoginDao extends JpaRepository<Login,Integer> {

	Login changePassword(Login login);

	
	Login save(String login);


	

}
