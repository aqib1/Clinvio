package com.doctor.portal.controllers;

import static com.doctor.portal.utils.AppConst.DOCTOR_PORTAL_URL;
import static com.doctor.portal.utils.AppConst.REGISTERATION_URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doctor.portal.business.RegisterationBusiness;
import com.doctor.portal.model.ProfileRequestModel;
import com.doctor.portal.model.ProfileResponseModel;

@RestController
@RequestMapping(DOCTOR_PORTAL_URL)
public class RegistrationController {

	@Autowired
	private RegisterationBusiness business;
	
	@GetMapping(REGISTERATION_URL)
	public ResponseEntity<ProfileResponseModel> register(ProfileRequestModel request) {		
		return new ResponseEntity<>(business.register(request), HttpStatus.OK);
	}
}
