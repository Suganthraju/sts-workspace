package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Day2Application {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(Day2Application.class, args);
		
		Student stu=new Student(28,"Suganth",30);
		ObjectMapper obj=new ObjectMapper();
		String str=obj.writeValueAsString(stu);
		System.out.print(str);
		
		
	}

}
