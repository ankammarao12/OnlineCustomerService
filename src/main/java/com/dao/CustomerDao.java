package com.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Customer;
import com.model.Login;

@Repository
public interface CustomerDao  extends JpaRepository<Customer,Integer>{
	

	List<Customer> findByName(String customerName);

	Customer findCustomerByEmail(String email);

	
	
}
	
