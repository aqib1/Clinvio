package com.doctor.portal.entities;

import com.doctor.portal.data.BaseEntity;

public class PAProfileEntity extends BaseEntity {

	private int id;
	
	private String name;
	
	private String contactNumber;
	
	public PAProfileEntity() {
	
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

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
}
