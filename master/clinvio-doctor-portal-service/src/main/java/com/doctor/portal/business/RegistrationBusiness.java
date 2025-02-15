package com.doctor.portal.business;

import static com.doctor.portal.utils.AppUtils.getAgeByDate;
import java.util.Objects;
import com.doctor.portal.documents.ProfileDocument;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import com.doctor.portal.exceptions.InvalidRequestException;
import com.doctor.portal.mapper.ProfileDocumentMapper;
import com.doctor.portal.model.ProfileRequestModel;
import com.doctor.portal.model.ProfileResponseModel;
import com.doctor.portal.services.Impl.RegistrationServiceImpl;
import com.doctor.portal.utils.AppUtils;
import reactor.core.publisher.Mono;

@Component
public class RegistrationBusiness {

    @Autowired
    private ProfileDocumentMapper mapper;

    @Autowired
    private RegistrationServiceImpl doctorRegistrationService;

    @Autowired
    private Environment env;


    public Mono<ResponseEntity<ProfileResponseModel>> register(ProfileRequestModel request) {
        validateDoctorProfileModelRequest(request);
        ProfileDocument doctorProfile = mapper.doctorProfileRequestModelToProfileDocument(request);
        doctorProfile.setAge(getAgeByDate(request.getDateOfBirth()));
        return doctorRegistrationService.save(doctorProfile)
                .map(profile -> ResponseEntity.status(HttpStatus.OK).body(successResponse()))
                .onErrorResume(throwable -> Mono.just(ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE)
                        .body(errorResponse(throwable))));
    }

    private ProfileResponseModel errorResponse(Throwable throwable) {
        return new ProfileResponseModel().createdAt(AppUtils.getCurrentDateTimestamp())
                .successCode(env.getProperty("not.acceptable.code", Integer.class))
                .detailedMessage(env.getProperty("profile.not.acceptable.detail.message"))
                .successMessage(throwable.getMessage());
    }

    private ProfileResponseModel successResponse() {
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
