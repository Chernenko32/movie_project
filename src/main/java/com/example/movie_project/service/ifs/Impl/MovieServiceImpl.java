package com.example.movie_project.service.ifs.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.movie_project.constants.ErrorMessage;
import com.example.movie_project.entity.Customer;
import com.example.movie_project.entity.Movie;
import com.example.movie_project.repository.CustomerDao;
import com.example.movie_project.repository.MovieDao;
import com.example.movie_project.service.ifs.MovieService;
import com.example.movie_project.vo.BuyTicketReq;
import com.example.movie_project.vo.BuyTicketRes;
import com.example.movie_project.vo.DeleteReq;
import com.example.movie_project.vo.ReviseReq;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private CustomerDao customerDao;

	@Autowired
	private MovieDao movieDao;

	@Override
	public BuyTicketRes createCustomerAndBuy(BuyTicketReq req) {
		BuyTicketRes res = new BuyTicketRes();
		if(!StringUtils.hasText(req.getBuyMovieCode())) {
			res.setMessage(ErrorMessage.MOVIE_CODE_NOT_EXSIST.getMessage());
			return res;
		}
		Optional<Movie> movieOp = movieDao.findById(req.getBuyMovieCode());
		if (movieOp.isEmpty()) {
			res.setMessage(ErrorMessage.MOVIE_CODE_NOT_EXSIST.getMessage());
			return res;
		}
		// 更新剩餘票數
		Movie movie = movieOp.get();
		movie.setAmountTicket(movie.getAmountTicket() - req.getTicketQuantity());
		//檢查剩餘票數
		if(movie.getAmountTicket()==0) {
			res.setMessage(ErrorMessage.TICKET_SOLD_OUT.getMessage());
			return res;
		}
		if(req.getTicketQuantity() > movie.getAmountTicket()) {
			res.setMessage(ErrorMessage.TICKET_NOT_ENOUGH.getMessage());
			return res;
		}
		movieDao.save(movie);
		// 存進DB
		Customer customer = new Customer();
		customer.setName(req.getCustomerName());
		customer.setBuyMovieCode(req.getBuyMovieCode());
		customer.setTicketQuantity(req.getTicketQuantity());
		customer.setTotalPrice(movie.getPrice() * req.getTicketQuantity());
		customerDao.save(customer);
		// 往res設值
		res.setCustomerId(customer.getId());
		res.setCustomerName(customer.getName());
		res.setBuyMovieCode(customer.getBuyMovieCode());
		res.setTicketQuantity(customer.getTicketQuantity());
		res.setTotalPrice(customer.getTotalPrice());
		res.setMessage(ErrorMessage.SUCCESS.getMessage());
		return res;
	}

	@Override
	public BuyTicketRes reviseCustomerAndBuy(ReviseReq req) {
		BuyTicketRes res = new BuyTicketRes();
		if(req.getCustomerId()==null) {
			res.setMessage(ErrorMessage.CUSTOMERID_NOT_EXSIST.getMessage());
			return res;
		}
		Optional<Customer> customerOp = customerDao.findById(req.getCustomerId());
		if (customerOp.isEmpty()) {
			res.setMessage(ErrorMessage.CUSTOMERID_NOT_EXSIST.getMessage());
			return res;
		}
		// 存進DB
		Customer customer = customerOp.get();
		customer.setTicketQuantity(req.getTicketQuantity());
		Movie movie = new Movie();
		if(movie.getAmountTicket()==0) {
			res.setMessage(ErrorMessage.TICKET_SOLD_OUT.getMessage());
			return res;
		}
		if(req.getTicketQuantity() > movie.getAmountTicket()) {
			res.setMessage(ErrorMessage.TICKET_NOT_ENOUGH.getMessage());
			return res;
		}
		customerDao.save(customer);
		// 往res設值
		res.setCustomerId(customer.getId());
		res.setCustomerName(customer.getName());
		res.setBuyMovieCode(customer.getBuyMovieCode());
		res.setTicketQuantity(customer.getTicketQuantity());
		res.setTotalPrice(customer.getTotalPrice());
		res.setMessage(ErrorMessage.SUCCESS.getMessage());
		return res;
	}

	@Override
	public BuyTicketRes deleteCustomerAndBuy(DeleteReq req) {
		BuyTicketRes res = new BuyTicketRes();
		if(req.getCustomerId()==null) {
			res.setMessage(ErrorMessage.CUSTOMERID_NOT_EXSIST.getMessage());
			return res;
		}
		Optional<Customer> customerOp = customerDao.findById(req.getCustomerId());
		if (customerOp.isPresent()) {
			customerDao.deleteById(req.getCustomerId());
			res.setMessage(ErrorMessage.SUCCESS.getMessage());
		}else {
			res.setMessage(ErrorMessage.CUSTOMERID_NOT_EXSIST.getMessage());
		}

		return res;
	}
}
