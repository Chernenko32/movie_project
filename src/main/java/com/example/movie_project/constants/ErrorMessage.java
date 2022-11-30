package com.example.movie_project.constants;

public enum ErrorMessage {
	SUCCESS("成功"),
	CUSTOMERID_NOT_EXSIST("顧客代碼不存在"),
	TICKET_SOLD_OUT("票已售完"),
	TICKET_NOT_ENOUGH("剩餘票數不足"),
	MOVIE_CODE_NOT_EXSIST("電影代碼不存在");
	
	

private String message;
	
	private ErrorMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
