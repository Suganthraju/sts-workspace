package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;


@SpringBootApplication
@OpenAPIDefinition
(info =@Info(
title = "Ice Cream",
version = "1.1.2",
description = "Ice cream Project",
contact = @Contact(
		name = "sugu",
		email = "suganthraju0512@gmail.com"
		)
)
)

public class OneToManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplication.class, args);
	}

}
