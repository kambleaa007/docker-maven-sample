package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.printf("Hello and welcome!");
	
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("i = " + i);
	        }
		
		SpringApplication.run(DemoApplication.class, args);
		

	}

}
