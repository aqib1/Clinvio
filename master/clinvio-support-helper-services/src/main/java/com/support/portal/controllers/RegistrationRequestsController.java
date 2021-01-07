package com.support.portal.controllers;

import static com.support.portal.utils.AppConst.SUPPORT_URL;
import static com.support.portal.utils.AppConst.REGISTRATION_REQUESTS_URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController(SUPPORT_URL)
public class RegistrationRequestsController {

	@Autowired
	private WebClient.Builder builder;

	@GetMapping(REGISTRATION_REQUESTS_URL)
	public void registrationRequests() {

	}
}
