package com.example.movie_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.movie_project.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

	public List<Customer> findByName(String name);
	
	public List<Customer> deleteByBuyMovieCode(String buyMovieCode);
	@Transactional
	@Modifying														//:传23︽肚秈ㄓ把计
	@Query("update Customer set status = 'expired' where order_date < :time and status = 'unpaid'")
	//int肚Θ穝掸计
	int updateStatus(@Param(value = "time") String time);
}
