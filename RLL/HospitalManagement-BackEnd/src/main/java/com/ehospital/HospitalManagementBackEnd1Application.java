package com.ehospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan
@EnableJpaRepositories
@SpringBootApplication
public class HospitalManagementBackEnd1Application {

	public static void main(String[] args) {
		SpringApplication.run(HospitalManagementBackEnd1Application.class, args);
	}

}
