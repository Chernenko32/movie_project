package com.example.movie_project.constants;

public enum ErrorMessage {
	SUCCESS("���\"),
	CUSTOMERID_NOT_EXSIST("�U�ȥN�X���s�b"),
	TICKET_SOLD_OUT("���w�⧹"),
	TICKET_NOT_ENOUGH("�Ѿl���Ƥ���"),
	MOVIE_CODE_NOT_EXSIST("�q�v�N�X���s�b");
	
	

private String message;
	
	private ErrorMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
