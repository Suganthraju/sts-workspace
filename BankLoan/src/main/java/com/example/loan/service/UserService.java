package com.example.loan.service;

import com.example.loan.dto.LoginDTO;
import com.example.loan.dto.UserDTO;
import com.example.loan.response.LoginMessage;

public interface UserService {
       String addUser(UserDTO userDTO);
       LoginMessage loginUser(LoginDTO loginDTO);
}