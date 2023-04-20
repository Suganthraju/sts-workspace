package com.example.day1.two;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Bubble
{
	public String name="power";
	
	
	@RequestMapping("/rosh")
	
	public String hello()
	{
		return "hi da "+name;
	}

}
