package com.doctor.portal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doctor.portal.entities.ProfileEntity;

public interface ProfileRepository extends JpaRepository<ProfileEntity, Integer> {
	
}
