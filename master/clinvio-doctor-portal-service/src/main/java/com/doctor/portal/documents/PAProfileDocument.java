package com.doctor.portal.documents;

import com.doctor.portal.data.BaseDocument;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * <p>
 * This is a embeddable class for doctor personal assistant details
 * </p>
 * 
 * @author AQIB JAVED
 * @since 14/12/2020
 * @version 1.0
 */

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PAProfileDocument extends BaseDocument {
	@Field("PA_NAME")
	private String name;
	@Field("PA_CONTACT")
	private String contactNumber;
}
