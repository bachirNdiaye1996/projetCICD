package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjetCicdApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ProjetCicdApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ProjetCicdApplication.class);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "Demo de CICD Application";
	}

}
