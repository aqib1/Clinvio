package com.doctor.portal.business;

import static com.doctor.portal.utils.AppUtils.getAgeByDate;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import com.doctor.portal.entities.ProfileEntity;
import com.doctor.portal.exceptions.InvalidRequestException;
import com.doctor.portal.mapper.ProfileEntityMapper;
import com.doctor.portal.model.ProfileRequestModel;
import com.doctor.portal.model.ProfileResponseModel;
import com.doctor.portal.services.Impl.RegisterationServiceImpl;
import com.doctor.portal.utils.AppUtils;

@Component
public class RegisterationBusiness {

	@Autowired
	private ProfileEntityMapper mapper;

	@Autowired
	private RegisterationServiceImpl doctorRegisterationService;

	@Autowired
	private Environment env;

	public ProfileResponseModel register(ProfileRequestModel request) {
		validateDoctorProfileModelRequest(request);
		ProfileEntity doctorProfile = mapper.doctorProfileRequestModelToDoctorProfileEntity(request);
		doctorProfile.setAge(getAgeByDate(request.getDateOfBirth()));
		try {
			doctorRegisterationService.insert(doctorProfile);
		} catch (Exception e) {

		}

		return new ProfileResponseModel().createdAt(AppUtils.getCurrentDateTimestamp())
				.successCode(env.getProperty("success.code", Integer.class))
				.detailedMessage(env.getProperty("profile.registration.success.detail.message"))
				.successMessage(env.getProperty("success.message"));
	}

	private void validateDoctorProfileModelRequest(ProfileRequestModel request) {
		if (Objects.isNull(request)) {
			throw new InvalidRequestException("Request cannot be null");
		}
		if (StringUtils.isBlank(request.getName())) {
			throw new InvalidRequestException("Request [name] cannot be null or empty");
		}
		if (StringUtils.isBlank(request.getContactNumber())) {
			throw new InvalidRequestException("Request [contact number] cannot be null or empty");
		}
		if (StringUtils.isBlank(request.getDateOfBirth())) {
			throw new InvalidRequestException("Request [date of birth] cannot be null or empty");
		}
		if (StringUtils.isBlank(request.getEmail())) {
			throw new InvalidRequestException("Request [email] cannot be null or empty");
		}
		if (StringUtils.isBlank(request.getPmdcNumber())) {
			throw new InvalidRequestException("Request [PMDC] cannot be null or empty");
		}
		if (Objects.isNull(request.getPaProfile())) {
			throw new InvalidRequestException("Request [PA information] cannot be null or empty");
		}
		if (Objects.isNull(request.getPaProfile().getName())) {
			throw new InvalidRequestException("Request [PA name] cannot be null or empty");
		}
		if (Objects.isNull(request.getPaProfile().getContactNumber())) {
			throw new InvalidRequestException("Request [PA contact number] cannot be null or empty");
		}
	}

}
