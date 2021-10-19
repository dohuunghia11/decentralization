package com.project.self.decentralization;

import com.project.self.decentralization.model.User;
import com.project.self.decentralization.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DecentralizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecentralizationApplication.class, args);
	}
}
