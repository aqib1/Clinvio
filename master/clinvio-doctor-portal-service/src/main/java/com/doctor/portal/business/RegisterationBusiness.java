package com.doctor.portal.business;

import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.doctor.portal.exceptions.InvalidRequestException;
import com.doctor.portal.model.DoctorProfileRequestModel;
import com.doctor.portal.model.DoctorProfileResponseModel;

@Component
public class RegisterationBusiness {
	
	public DoctorProfileResponseModel register(DoctorProfileRequestModel request) {
		validateDoctorProfileModelRequest(request);
		return null;
	}

	private void validateDoctorProfileModelRequest(DoctorProfileRequestModel request) {
		if(Objects.isNull(request)) {
			throw new InvalidRequestException("Request cannot be null");
		}
		if(StringUtils.isBlank(request.getName())) {
			throw new InvalidRequestException("Request [name] cannot be null or empty");
		}
		if(StringUtils.isBlank(request.getContactNumber())) {
			throw new InvalidRequestException("Request [contact number] cannot be null or empty");
		}
		if(StringUtils.isBlank(request.getDateOfBirth())) {
			throw new InvalidRequestException("Request [date of birth] cannot be null or empty");
		}
		if(StringUtils.isBlank(request.getEmail())) {
			throw new InvalidRequestException("Request [email] cannot be null or empty");
		}
		if(StringUtils.isBlank(request.getPmdcNumber())) {
			throw new InvalidRequestException("Request [PMDC] cannot be null or empty");
		}
		if(Objects.isNull(request.getPaProfile())) {
			throw new InvalidRequestException("Request [PA information] cannot be null or empty");
		}
		if(Objects.isNull(request.getPaProfile().getName())) {
			throw new InvalidRequestException("Request [PA name] cannot be null or empty");
		}
		if(Objects.isNull(request.getPaProfile().getContactNumber())) {
			throw new InvalidRequestException("Request [PA contact number] cannot be null or empty");
		}
	}
	
}
