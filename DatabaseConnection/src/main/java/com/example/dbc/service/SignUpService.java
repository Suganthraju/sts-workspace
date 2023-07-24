package com.example.dbc.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dbc.model.SignUp;
import com.example.dbc.repository.SignUpRepo;

@Service
public class SignUpService {
  @Autowired 
  SignUpRepo repo;
  public Iterable<SignUp> GetAll(){
    return repo.findAll();
  }
  
}