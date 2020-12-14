package com.doctor.portal.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.portal.entities.ProfileEntity;
import com.doctor.portal.repositories.ProfileRepository;
import com.doctor.portal.services.RegisterationService;

@Service
public class RegisterationServiceImpl implements RegisterationService {

	@Autowired
	private ProfileRepository repository;

	@Override
	public void insert(ProfileEntity profile) {
		repository.save(profile);
	}

}
