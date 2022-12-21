package com.example.movie_project.constants;

public enum ErrorMessage {
	SUCCESS("Θ"),
	CUSTOMERID_NOT_EXSIST("臮絏ぃ"),
	TICKET_SOLD_OUT("布扳Ч"),
	TICKET_NOT_ENOUGH("逞緇布计ぃì"),
	TICKET_ERROR("布计ぃ眔箂"),
	PHONE_NUMBER_ERROR("も诀腹絏Α岿粇"),
	MOVIE_CODE_NOT_EXSIST("筿紇絏ぃ");
	
	

	private String message;
	
	private ErrorMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
