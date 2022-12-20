package com.example.movie_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.movie_project.service.ifs.MovieService;
import com.example.movie_project.vo.BuyTicketReq;
import com.example.movie_project.vo.BuyTicketRes;
import com.example.movie_project.vo.DeleteReq;
import com.example.movie_project.vo.ReviseReq;

@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@PostMapping(value = "/api/createCustomerAndBuy")
	public BuyTicketRes createCustomerAndBuy(@RequestBody BuyTicketReq req) {
		return movieService.createCustomerAndBuy(req);
	}
	
	@PostMapping(value = "/api/reviseCustomerAndBuy")
	public BuyTicketRes reviseCustomerAndBuy(@RequestBody ReviseReq req) {
		return movieService.reviseCustomerAndBuy(req);
	}
//	@Modifying 
//	@Transactional
	@PostMapping(value = "/api/deleteCustomerAndBuy")
	public BuyTicketRes deleteCustomerAndBuy(@RequestBody DeleteReq req) {
		return movieService.deleteCustomerAndBuy(req);
	}
	
	@ResponseStatus(value = HttpStatus.NO_CONTENT)//指定HttpStatus返回204的狀態,NO_CONTENT為無內容的Response,狀態為204
	@PostMapping(value = "/api/reviseVerify")
	public void reviseVerify(@RequestBody BuyTicketReq req) {
		movieService.reviseStatus(req);
	}
}
