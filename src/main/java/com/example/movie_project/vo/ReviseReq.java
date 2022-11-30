package com.example.movie_project.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReviseReq {

	@JsonProperty("customer_id")
	private Integer customerId;

	@JsonProperty("ticket_quantity")
	private Integer ticketQuantity;

	public ReviseReq() {

	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getTicketQuantity() {
		return ticketQuantity;
	}

	public void setTicketQuantity(Integer ticketQuantity) {
		this.ticketQuantity = ticketQuantity;
	}

}
