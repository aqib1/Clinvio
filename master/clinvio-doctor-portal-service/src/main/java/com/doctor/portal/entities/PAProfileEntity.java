package com.doctor.portal.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import com.doctor.portal.data.BaseEntity;

/**
 * <p>
 * This is a embeddable class for doctor personal assistant details
 * </p>
 * 
 * @author AQIB JAVED
 * @since 14/12/2020
 * @version 1.0
 */
@Embeddable
public class PAProfileEntity extends BaseEntity {

	@Column(name = "PA_NAME")
	private String name;

	@Column(name = "PA_CONTACT_NUMBER")
	private String contactNumber;

	public PAProfileEntity() {
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
