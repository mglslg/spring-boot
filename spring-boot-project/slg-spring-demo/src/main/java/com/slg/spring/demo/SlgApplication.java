package com.slg.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.slg.huli")
public class SlgApplication {
	public static void main(String[] args) {
		SpringApplication.run(SlgApplication.class, args);
	}
}
