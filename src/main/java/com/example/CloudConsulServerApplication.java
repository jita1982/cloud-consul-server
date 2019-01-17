package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class CloudConsulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConsulServerApplication.class, args);
	}
	
	@RequestMapping("/home")
	public Object home() {
		System.out.println("1111111111111");
		return "OK11";
	}


}
