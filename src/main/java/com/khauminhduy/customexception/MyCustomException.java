package com.khauminhduy.customexception;

public class MyCustomException extends Exception {

	public MyCustomException(String message) {
		super(message);
	}
	
	public MyCustomException(String message, Exception ex) {
		super(message, ex);
	}

}
