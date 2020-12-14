package com.doctor.portal.utils;
import static com.doctor.portal.utils.AppConst.CURRENT_TIME_STAMP_FORMAT;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.Period;

public class AppUtils {
	
	private AppUtils() {
		
	}
	
	//get age from date of birth with format yyyy-dd-mm
	public static int getAgeByDate(String dateOfBirth) {
		return Period.between(LocalDate.parse(dateOfBirth), LocalDate.now()).getYears();
	}
	
	public static String getCurrentDateTimestamp() {
		return CURRENT_TIME_STAMP_FORMAT.format(new Timestamp(System.currentTimeMillis()));
	}
}
