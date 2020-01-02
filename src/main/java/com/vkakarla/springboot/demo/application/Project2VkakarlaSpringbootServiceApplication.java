package com.vkakarla.springboot.demo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value="com.vkakarla.springboot.demo.*")
public class Project2VkakarlaSpringbootServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project2VkakarlaSpringbootServiceApplication.class, args);
	}

}
