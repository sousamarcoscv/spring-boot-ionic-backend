package com.marcossousa.services.exceptions;

public class AuthorizathionException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public AuthorizathionException(String msg) {
		super(msg);
	}
	
	public AuthorizathionException(String msg, Throwable cause) {
		super(msg,cause);
	}
	
	
}
