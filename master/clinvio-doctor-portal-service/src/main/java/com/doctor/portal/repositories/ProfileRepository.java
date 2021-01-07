package com.doctor.portal.repositories;


import com.doctor.portal.documents.ProfileDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProfileRepository extends ReactiveMongoRepository<ProfileDocument, String> {
	
}
