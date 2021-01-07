package com.doctor.portal.mapper;

import com.doctor.portal.documents.ProfileDocument;
import org.mapstruct.Mapper;

import com.doctor.portal.documents.PAProfileDocument;
import com.doctor.portal.model.PAProfileRequestModel;
import com.doctor.portal.model.ProfileRequestModel;

@Mapper(componentModel = "spring")
public interface ProfileDocumentMapper {

	ProfileDocument doctorProfileRequestModelToProfileDocument(
			ProfileRequestModel doctorProfileRequestModel);

	PAProfileDocument paProfileRequestModelToPAProfileDocument(PAProfileRequestModel paProfileRequestModel);
}
