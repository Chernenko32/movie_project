package com.example.movie_project.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuyTicketReq {
	@JsonProperty("customer_id")
	private Integer customerId;

	@JsonProperty("customer_name")
	private String customerName;

	@JsonProperty("buy_movie_code")
	private String buyMovieCode;

	@JsonProperty("ticket_quantity")
	private Integer ticketQuantity;

	public BuyTicketReq() {

	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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

}
