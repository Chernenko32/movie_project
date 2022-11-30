package com.example.movie_project.entity;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "movie")
public class Movie {

	@Id
	@Column(name = "movie_code")
	private String movieCode;

	@Column(name = "movie_name")
	private String movieName;

	@Column(name = "day")
	private String day;

	@Column(name = "start_time")
	private LocalTime startTime;

	@Column(name = "price")
	private Integer price;

	@Column(name = "type")
	private String type;

	@Column(name = "total_ticket")
	private Integer totalTicket;

	@Column(name = "amount_ticket")
	private Integer amountTicket;

	public Movie() {

	}

	public Movie(String movieCode, String movieName, String day, LocalTime startTime, Integer price, String type,
			Integer totalTicket, Integer amountTicket) {

		this.movieCode = movieCode;
		this.movieName = movieName;
		this.day = day;
		this.startTime = startTime;
		this.price = price;
		this.type = type;
		this.totalTicket = totalTicket;
		this.amountTicket = amountTicket;
	}

	public String getMovieCode() {
		return movieCode;
	}

	public void setMovieCode(String movieCode) {
		this.movieCode = movieCode;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getTotalTicket() {
		return totalTicket;
	}

	public void setTotalTicket(Integer totalTicket) {
		this.totalTicket = totalTicket;
	}

	public Integer getAmountTicket() {
		return amountTicket;
	}

	public void setAmountTicket(Integer amountTicket) {
		this.amountTicket = amountTicket;
	}

}
