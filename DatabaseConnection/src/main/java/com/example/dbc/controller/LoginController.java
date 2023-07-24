package com.example.dbc.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.dbc.model.SignUp;
import com.example.dbc.service.SignUpService;



@RestController
@CrossOrigin
@RequestMapping("/login")
public class LoginController {
  @Autowired 
  SignUpService ser;
  @GetMapping("/get")
  private Iterable<SignUp> GetUsers(){
    return ser.GetAll();
  }
}