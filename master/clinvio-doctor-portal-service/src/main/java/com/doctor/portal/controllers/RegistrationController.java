package com.doctor.portal.controllers;

import static com.doctor.portal.utils.AppConst.DOCTOR_PORTAL_URL;
import static com.doctor.portal.utils.AppConst.REGISTERATION_URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(DOCTOR_PORTAL_URL)
public class RegistrationController {

	@GetMapping(REGISTERATION_URL)
	public String register() {
		return "test";
	}
}
