package com.example.dbc.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbc.dto.LoginDTO;
import com.example.dbc.dto.UserDTO;
import com.example.dbc.model.UserModel;
import com.example.dbc.repository.UserRepository;
import com.example.dbc.response.LoginMessage;
import com.example.dbc.service.UserService;


@CrossOrigin("*")
@RestController
public class UserController {
	 @Autowired
	 UserService us;
	 @Autowired
	 UserRepository ur;
	 @GetMapping("/all")
	 public List<UserModel>getAllDetails(){
		 return ur.findAll();
	 }
     @PostMapping("/usesave")
     public String saveUser(@RequestBody UserDTO userDTO)
     {
    	 String id=us.addUser(userDTO);
    	 return id;
     }
     @PostMapping("/newlogin")
     public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO)
     {
    	 LoginMessage loginMessage=us.loginUser(loginDTO);
    	 return ResponseEntity.ok(loginMessage);
     }

}