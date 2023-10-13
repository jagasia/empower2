package com.empower;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImageRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageRestApplication.class, args);
		System.out.println("product image demo runs here.");
	}

}
