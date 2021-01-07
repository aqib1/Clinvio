package com.doctor.portal.controllers;

import com.doctor.portal.business.ManageProfileBusiness;
import com.doctor.portal.documents.ProfileDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import static com.doctor.portal.utils.AppConst.DOCTOR_PORTAL_URL;

@RestController
@RequestMapping(DOCTOR_PORTAL_URL)
public class ManageProfileController {

    @Autowired
    private ManageProfileBusiness manageProfileBusiness;

    public Flux<ResponseEntity<ProfileDocument>> getAllInactiveProfiles() {
        return manageProfileBusiness.getAllInactiveProfiles();
    }
}
