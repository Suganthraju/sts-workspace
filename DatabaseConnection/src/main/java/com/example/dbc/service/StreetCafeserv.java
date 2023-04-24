package com.example.dbc.service;

import java.util.Optional;

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

	public void deletedetails(int hii) {
		// TODO Auto-generated method stub
		crepo.deleteById(hii);
	}

	public Optional<StreetCafe> getdetails(int hii) {
		// TODO Auto-generated method stub
		return crepo.findById(hii);
	}

	public StreetCafe updatedetails(StreetCafe hii) {
		// TODO Auto-generated method stub
		return crepo.saveAndFlush(hii);
	}

}
