package com.exceptions;

public class ServiceException extends Exception {

	static final long serialVersionUID = -2394028450336196502L;

	public ServiceException() {
		super();
	}
	
	public ServiceException(String message) {
		super(message);
	}
	
	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ServiceException(Throwable cause) {
		super(cause);
	}
	
}