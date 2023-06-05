package com.example.dbc.service;
import com.example.dbc.dto.LoginDTO;
import com.example.dbc.dto.UserDTO;
import com.example.dbc.response.LoginMessage;

public interface UserService {
      String addUser(UserDTO userDTO);
	LoginMessage loginUser(LoginDTO loginDTO);
}
