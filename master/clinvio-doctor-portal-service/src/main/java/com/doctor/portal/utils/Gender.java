package com.doctor.portal.utils;
/**
 * <p>
 * Enum type for gender types
 * </p>
 * 
 * @author AQIB JAVED
 * @since 14/12/2020
 * @version 1.0
 */
public enum Gender {
	MALE("M"), FEMALE("F"), OTHER("O");

	private String code;

	private Gender(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
