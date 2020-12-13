package com.doctor.portal.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.doctor.portal.entities.DoctorProfileEntity;



@RestController
public class RequestRegisterationController {

	@GetMapping("/test")
	public DoctorProfileEntity test() {
		DoctorProfileEntity entity = new DoctorProfileEntity();
		entity.setActive(true);
		entity.setAccessUrl("/tmp");
		entity.setName("Ali");
		return entity;
	}
}
