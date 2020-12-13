package com.doctor.portal.converters;

import java.util.Objects;
import java.util.stream.Stream;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import com.doctor.portal.exceptions.InvalidGenderException;
import com.doctor.portal.utils.Gender;
/**
 * <p>
 * This is a converter class for gender enum type to database column,
 * this API is introduced in JPA 2.1
 * </p>
 * 
 * @author AQIB JAVED
 * @since 14/12/2020
 * @version 1.0
 * {@link com.doctor.portal.utils.Gender}
 */
@Converter(autoApply = true)
public class GenderConverter implements AttributeConverter<Gender, String> {

	@Override
	public String convertToDatabaseColumn(Gender attribute) {
		if (Objects.isNull(attribute)) {
			throw new InvalidGenderException("Gender cannot be null");
		}
		return attribute.getCode();
	}

	@Override
	public Gender convertToEntityAttribute(String dbData) {
		return Stream.of(Gender.values()).filter(gender -> gender.getCode().equals(dbData)).findFirst()
				.orElseThrow(InvalidGenderException::new);
	}

}
