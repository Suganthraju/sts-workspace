package com.example.dbc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.dbc.model.AdditionalDetails;


public interface AdditionalRepo extends JpaRepository<AdditionalDetails,Integer> {

}
