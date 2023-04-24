package com.example.dbc.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbc.model.StreetCafe;
import com.example.dbc.service.StreetCafeserv;

@RestController
public class StreetCafecont {
	@Autowired
	public StreetCafeserv cserv;
	
	
	//posting the details
	@PostMapping("/project")
	public StreetCafe addDetails(@RequestBody StreetCafe hii)
	{
		return cserv.saveInfo(hii);
	}
	//Deleting the details
	@DeleteMapping("/project/{hii}")
	public String deletedetails(@PathVariable("hii")int hii)
	{
		cserv.deletedetails(hii);
		return "Deletion was successful";
	}
	
	//getting the details
	@GetMapping("/project/{hii}")
	public Optional<StreetCafe> getdetails(@PathVariable("hii")int hii)
	{
		return cserv.getdetails(hii);
	}
	
	//updating the given details
	@PutMapping("/update")
	public StreetCafe updatedetails(@RequestBody StreetCafe hii)
	{
		return cserv.updatedetails(hii);
	}
	
	
	
	
	
	
}
