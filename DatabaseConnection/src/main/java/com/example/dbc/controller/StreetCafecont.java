package com.example.dbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbc.model.StreetCafe;
import com.example.dbc.service.StreetCafeserv;

@RestController
public class StreetCafecont {
	@Autowired
	public StreetCafeserv cserv;
	
	@PostMapping("/project")
	public StreetCafe addDetails(@RequestBody StreetCafe hii)
	{
		return cserv.saveInfo(hii);
	}

}
