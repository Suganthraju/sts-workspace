package com.example.day1.three;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fruit {
	@Value("${namevalue:restapi}")

   public String name;

   @GetMapping("/velu")

   public String hi()
  {
	return" welcome to "+name;
  }

}
