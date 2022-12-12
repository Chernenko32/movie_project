package com.example.movie_project.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BuyTicketRes {

	private Integer customerId;

	private String customerName;

	private String buyMovieCode;

	private Integer ticketQuantity;

	private Integer totalPrice;

	private boolean verify;

	private String message;

	public BuyTicketRes() {

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

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isVerify() {
		return verify;
	}

	public void setVerify(boolean verify) {
		this.verify = verify;
	}

}
