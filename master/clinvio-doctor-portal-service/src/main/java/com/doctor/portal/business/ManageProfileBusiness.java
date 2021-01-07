package com.doctor.portal.business;

import com.doctor.portal.documents.ProfileDocument;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public class ManageProfileBusiness {

    public Flux<ResponseEntity<ProfileDocument>> getAllInactiveProfiles() {
        return null;
    }
}
