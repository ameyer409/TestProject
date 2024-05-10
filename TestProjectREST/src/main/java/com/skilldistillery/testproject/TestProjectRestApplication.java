package com.skilldistillery.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class TestProjectRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestProjectRestApplication.class, args);
	}
	
	@Bean
	PasswordEncoder configurePasswordEncoder() {
	   return new BCryptPasswordEncoder();
	}

}
