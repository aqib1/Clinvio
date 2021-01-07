package com.doctor.portal.controllers;

import static com.doctor.portal.utils.AppConst.DOCTOR_PORTAL_URL;
import static com.doctor.portal.utils.AppConst.REGISTRATION_URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doctor.portal.business.RegistrationBusiness;
import com.doctor.portal.model.ProfileRequestModel;
import com.doctor.portal.model.ProfileResponseModel;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping(DOCTOR_PORTAL_URL)
public class RegistrationController {

	@Autowired
	private RegistrationBusiness business;
	
	@PostMapping(REGISTRATION_URL)
	public Mono<ResponseEntity<ProfileResponseModel>> register(@RequestBody ProfileRequestModel request) {
		return business.register(request);
	}
}
