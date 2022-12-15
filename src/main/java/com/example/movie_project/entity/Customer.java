package com.example.movie_project.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "customer")
public class Customer {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
	private String name;

	@CreationTimestamp
	@Column(name = "order_date")
	private LocalDateTime orderDate;

	@Column(name = "movie_code")
	private String buyMovieCode;

	@Column(name = "ticket_quantity")
	private Integer ticketQuantity;

	@Column(name = "total_price")
	private Integer totalPrice;

	@Column(name = "status")
	private String status;

	public Customer() {

	}

	public Customer(Integer id, String name, LocalDateTime orderDate, String buyMovieCode, Integer ticketQuantity,
			Integer totalPrice, String status) {
		this.id = id;
		this.name = name;
		this.orderDate = orderDate;
		this.buyMovieCode = buyMovieCode;
		this.ticketQuantity = ticketQuantity;
		this.totalPrice = totalPrice;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public String getBuyMovieCode() {
		return buyMovieCode;
	}

	public void setBuyMovieCode(String buyMovieCode) {
		this.buyMovieCode = buyMovieCode;
	}

	public Integer getTicketQuantity() {
		return ticketQuantity;
	}

	public void setTicketQuantity(Integer ticketQuantity) {
		this.ticketQuantity = ticketQuantity;
	}

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
