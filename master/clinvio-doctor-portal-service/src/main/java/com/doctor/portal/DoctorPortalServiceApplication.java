package com.doctor.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
/**
 * <p>
 * This is the main class for starting doctor portal service
 * </p>
 * 
 * @author AQIB JAVED
 * @since 11/12/2020
 * @version 1.0
 */
@SpringBootApplication
@EnableJpaRepositories
public class DoctorPortalServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorPortalServiceApplication.class, args);
	}
}
