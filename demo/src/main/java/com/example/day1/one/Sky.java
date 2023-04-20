package com.example.day1.one;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class Sky {
	@RequestMapping("/sugu")
	@ResponseBody
	public String hyy()
	
	{
	 return "welcome arun";	
	}

}