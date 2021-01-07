package com.doctor.portal.services;

import com.doctor.portal.documents.ProfileDocument;
import reactor.core.publisher.Mono;

public interface RegistrationService {
	Mono<ProfileDocument> save(ProfileDocument profile);
}
