package com.doctor.portal.entities;

import static com.doctor.portal.utils.AppConst.DOCTOR_PROFILE_TABLE_NAME;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.doctor.portal.data.BaseEntity;
import com.doctor.portal.utils.Gender;

/**
 * <p>
 * This class contains all the informations of doctor profile which is approved
 * by support. Doctor profile entity will hold all the information about doctor,
 * and his/her PA, also facilitate system about the status of working.
 * </p>
 * 
 * @author AQIB JAVED
 * @since 11/12/2020
 * @version 1.0
 */
@Entity(name = DOCTOR_PROFILE_TABLE_NAME)
public class DoctorProfileEntity extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "GENDER")
	private Gender gender;
	
	@Column(name = "CONTACT_NUMBER")
	private String contactNumber;

	@Column(name = "DATE_OF_BIRTH")
	private String dateOfBirth;

	@Column(name = "AGE")
	private int age;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PROFILE")
	private String profile;

	@Column(name = "ACCESS_URL")
	private String accessUrl;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "PMDC_NUMBER")
	private String pmdcNumber;

	@Column(name = "BIOGRAPHY")
	private String biography;

	@Embedded
	private PAProfileEntity paProfile;

	@Column(name = "ACTIVE")
	private boolean isActive;

	public DoctorProfileEntity() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getAccessUrl() {
		return accessUrl;
	}

	public void setAccessUrl(String accessUrl) {
		this.accessUrl = accessUrl;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPmdcNumber() {
		return pmdcNumber;
	}

	public void setPmdcNumber(String pmdcNumber) {
		this.pmdcNumber = pmdcNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public PAProfileEntity getPaProfile() {
		return paProfile;
	}

	public void setPaProfile(PAProfileEntity paProfile) {
		this.paProfile = paProfile;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}
