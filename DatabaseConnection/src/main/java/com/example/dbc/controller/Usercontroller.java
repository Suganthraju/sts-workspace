package com.example.dbc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.dbc.model.Usermodel;
import com.example.dbc.service.Userservice;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class Usercontroller {
	@Autowired
	Userservice useserv;
	
	@Tag(name="Posting",description ="details")
	@PostMapping("/pro")
	public Usermodel addDetails(@RequestBody Usermodel hii)
	{
		return useserv.saveInfo(hii);
	}
	
	    //loginpage
	@Tag(name="login",description ="details")
	@PostMapping("/login")
		public String login(@RequestBody Map<String,String> loginDataMap)
		{
			String username = loginDataMap.get("username");
			String password = loginDataMap.get("password");
			String result = useserv.loginCheckData(username, password);
			return result;
		}

}
