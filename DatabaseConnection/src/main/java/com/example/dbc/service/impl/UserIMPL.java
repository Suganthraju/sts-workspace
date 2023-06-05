package com.example.dbc.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dbc.model.UserModel;
import com.example.dbc.dto.LoginDTO;
import com.example.dbc.dto.UserDTO;
import com.example.dbc.repository.UserRepository;
import com.example.dbc.response.LoginMessage;
import com.example.dbc.service.UserService;
@Service
public class UserIMPL implements UserService{
     @Autowired
     UserRepository ur;
    
     @Override
     public String addUser(UserDTO userDTO) {
  
         UserModel user = new UserModel(
  
                 userDTO.getUserid(),
                 userDTO.getUsername(),
                 userDTO.getEmail(),
                 userDTO.getMobileno(),
                 userDTO.getPassword(),
                 userDTO.getAge()
  
         );
         ur.save(user);
  
         return user.getUsername();
     }
     @Override
     public LoginMessage  loginUser(LoginDTO loginDTO) {
         
         UserModel user1 = ur.findByUsername(loginDTO.getUsername());
         if (user1 != null) {
             String password = loginDTO.getPassword();
     
             if (password.equals(password)) {
                 Optional<UserModel> user = ur.findOneByUsernameAndPassword(loginDTO.getUsername(), password);
                 if (user.isPresent()) {
                     return new LoginMessage("Login Success", true);
                 } else {
                     return new LoginMessage("Login Failed", false);
                 }
             } else {
  
                 return new LoginMessage("password Not Match", false);
             }
         }else {
             return new LoginMessage("Username not exits", false);
         }
  
  
     }
}