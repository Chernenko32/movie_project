package com.example.movie_project.service.ifs;

import com.example.movie_project.vo.BuyTicketReq;
import com.example.movie_project.vo.BuyTicketRes;
import com.example.movie_project.vo.DeleteReq;
import com.example.movie_project.vo.ReviseReq;

public interface MovieService {
	//買票
	public BuyTicketRes createCustomerAndBuy(BuyTicketReq req);
	//修改
	public BuyTicketRes reviseCustomerAndBuy(ReviseReq req);
	//刪除
	public BuyTicketRes deleteCustomerAndBuy(DeleteReq req);
	//改變驗證狀態
	public void reviseVerify(BuyTicketReq req);
	
}
