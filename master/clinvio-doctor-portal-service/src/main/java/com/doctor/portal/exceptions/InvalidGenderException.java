package com.doctor.portal.exceptions;

/**
 * <p>
 * This is a exception class for invalid gender type
 * </p>
 * 
 * @author AQIB JAVED
 * @since 14/12/2020
 * @version 1.0
 */
public class InvalidGenderException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3014046360769043174L;

	public InvalidGenderException() {
	}
	
	public InvalidGenderException(String err) {
		super(err);
	}

	public InvalidGenderException(String err, Throwable e) {
		super(err, e);
	}

}
