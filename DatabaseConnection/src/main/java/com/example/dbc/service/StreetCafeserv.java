package com.example.dbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dbc.model.StreetCafe;
import com.example.dbc.repository.StreetCaferepo;
@Service
public class StreetCafeserv {
	@Autowired
	public StreetCaferepo crepo;
	
	public StreetCafe saveInfo(StreetCafe hyy) {
		return crepo.save(hyy);
	}

}
