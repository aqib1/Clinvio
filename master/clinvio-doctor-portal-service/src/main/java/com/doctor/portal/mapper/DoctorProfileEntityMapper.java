package com.doctor.portal.mapper;

import org.mapstruct.Mapper;

import com.doctor.portal.entities.DoctorProfileEntity;
import com.doctor.portal.entities.PAProfileEntity;
import com.doctor.portal.model.DoctorProfileRequestModel;
import com.doctor.portal.model.PAProfileRequestModel;

@Mapper(componentModel = "spring")
public interface DoctorProfileEntityMapper {

	DoctorProfileEntity doctorProfileRequestModelToDoctorProfileEntity(
			DoctorProfileRequestModel doctorProfileRequestModel);

	PAProfileEntity paProfileRequestModelToPAProfileEntity(PAProfileRequestModel paProfileRequestModel);
}
