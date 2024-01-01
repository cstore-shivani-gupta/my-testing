package com.test.test_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
		System.out.println("Application started");
		System.out.println("changes by ticket-1");
		System.out.println("Changes by ticket-2-changes2-new");

	}

}
