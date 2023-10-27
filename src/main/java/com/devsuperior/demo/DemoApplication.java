package com.devsuperior.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Encode = " +   passwordEncoder.encode("123456"));
		boolean result = passwordEncoder.matches("1234567", "$2a$10$zWIesH6wWMQdjBO0DLHuT.PSbd3h0RTt1Kbq7IzbxmJ7qtYTD1J8O");
		System.out.println("Resultado = " + result);
	}
}
