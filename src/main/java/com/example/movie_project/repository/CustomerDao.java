package com.example.movie_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movie_project.entity.Customer;


public interface CustomerDao extends JpaRepository<Customer, Integer> {

	public List<Customer> findByName(String name);
	
	public List<Customer> deleteByBuyMovieCode(String buyMovieCode);
}
