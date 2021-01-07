package com.doctor.portal.documents;

import com.doctor.portal.data.BaseDocument;
import com.doctor.portal.utils.Gender;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


/**
 * <p>
 * This class contains all the information of doctor profile which is approved
 * by support. Doctor profile entity will hold all the information about doctor,
 * and his/her PA, also facilitate system about the status of working.
 * </p>
 *
 * @author AQIB JAVED
 * @version 1.0
 * @since 11/12/2020
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "profile")
public class ProfileDocument extends BaseDocument {
    @Transient
    public static final String SEQUENCE_NAME = "doctor_profile_sequence";
    @Id
    private String id;
    @Field("NAME")
    private String name;
    @Field("PASSWORD")
    private String password;
    @Field("PMDC")
    private String pmdcNumber;
    @Field("GENDER")
    private Gender gender;
    @Field("CONTACT")
    @Indexed(unique = true)
    private String contactNumber;
    @Field("DOB")
    private String dateOfBirth;
    @Field("AGE")
    private int age;
    @Field("EMAIL")
    private String email;
    @Field("PROFILE")
    private String profile;
    @Field("URL")
    private String accessUrl;
    @Field("BIOGRAPHY")
    private String biography;
    @Field("PERSONAL_ASSISTANT")
    private PAProfileDocument paProfile;
    @Field("ACTIVE")
    private boolean isActive;
}
