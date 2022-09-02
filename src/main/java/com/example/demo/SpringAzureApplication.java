package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureApplication {
	@GetMapping("/")
	public String greeting(){
		return "Welcome TO SpringBoot Azure Application ";
	}
	@GetMapping("/msg")
	public String getMessage(){
		return "Welcome TO SpringBoot Azure Application  in Azure Platform";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureApplication.class, args);
	}

}
