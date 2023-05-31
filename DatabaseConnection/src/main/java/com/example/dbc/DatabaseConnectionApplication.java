package com.example.dbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition
        (info =@Info(
		title = "Street Cafe",
		version = "1.1.2",
		description = "Project",
		contact = @Contact(
				name = "Suganth",
				email = "suganth0512@gmail.com"
				)
		)
        )
public class DatabaseConnectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseConnectionApplication.class, args);
	}

}
