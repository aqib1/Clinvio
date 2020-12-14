package com.doctor.portal.mapper;

import org.mapstruct.Mapper;

import com.doctor.portal.entities.PAProfileEntity;
import com.doctor.portal.entities.ProfileEntity;
import com.doctor.portal.model.PAProfileRequestModel;
import com.doctor.portal.model.ProfileRequestModel;

@Mapper(componentModel = "spring")
public interface ProfileEntityMapper {

	ProfileEntity doctorProfileRequestModelToDoctorProfileEntity(
			ProfileRequestModel doctorProfileRequestModel);

	PAProfileEntity paProfileRequestModelToPAProfileEntity(PAProfileRequestModel paProfileRequestModel);
}
