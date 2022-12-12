package com.example.movie_project.service.ifs;

import com.example.movie_project.vo.BuyTicketReq;
import com.example.movie_project.vo.BuyTicketRes;
import com.example.movie_project.vo.DeleteReq;
import com.example.movie_project.vo.ReviseReq;

public interface MovieService {
	//�R��
	public BuyTicketRes createCustomerAndBuy(BuyTicketReq req);
	//�ק�
	public BuyTicketRes reviseCustomerAndBuy(ReviseReq req);
	//�R��
	public BuyTicketRes deleteCustomerAndBuy(DeleteReq req);
	//�������Ҫ��A
	public void reviseVerify(BuyTicketReq req);
	
}
