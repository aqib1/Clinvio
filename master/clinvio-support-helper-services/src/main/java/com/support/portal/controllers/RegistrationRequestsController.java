package com.support.portal.controllers;

import static com.support.portal.utils.AppConst.SUPPORT_URL;
import static com.support.portal.utils.AppConst.REGISTERATION_REQUESTS_URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(SUPPORT_URL)
public class RegistrationRequestsController {

	@GetMapping(REGISTERATION_REQUESTS_URL)
	public void registerationRequests() {
		
	}
}
