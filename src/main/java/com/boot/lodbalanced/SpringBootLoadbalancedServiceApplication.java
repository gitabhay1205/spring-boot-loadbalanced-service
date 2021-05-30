package com.boot.lodbalanced;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootLoadbalancedServiceApplication {
	
	@Value("${server.port}")
	private int port;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoadbalancedServiceApplication.class, args);
	}

	@GetMapping("/service")
	public String message()
	{
		return "Service running on port "+port;
	}
}
