package com.doctor.portal.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.portal.documents.ProfileDocument;
import com.doctor.portal.repositories.ProfileRepository;
import com.doctor.portal.services.RegistrationService;
import reactor.core.publisher.Mono;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private ProfileRepository repository;

	@Override
	public Mono<ProfileDocument> save(ProfileDocument profile) {
		return repository.save(profile);
	}

}
