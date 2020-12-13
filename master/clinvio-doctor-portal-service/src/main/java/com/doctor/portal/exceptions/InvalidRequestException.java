package com.doctor.portal.exceptions;

public class InvalidRequestException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6454767523260756038L;

	public InvalidRequestException() {
	}

	public InvalidRequestException(String err) {
		super(err);
	}

	public InvalidRequestException(String err, Throwable e) {
		super(err, e);
	}
}
