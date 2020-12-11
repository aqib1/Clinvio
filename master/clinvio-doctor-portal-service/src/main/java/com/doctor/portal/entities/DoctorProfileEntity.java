package com.doctor.portal.entities;

public class DoctorProfileEntity {

	private int id;

	private String name;

	private String gender;

	private String dateOfBirth;

	private int age;

	private String email;

	private String profile;

	private String accessUrl;

	private String password;

	private String pmdcNumber;

	private String biography;
	
	private PAProfileEntity paProfile;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
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
}
