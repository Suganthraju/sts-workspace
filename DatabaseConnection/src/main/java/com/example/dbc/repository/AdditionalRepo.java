package com.example.dbc.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dbc.model.AdditionalDetails;

@Repository
public interface AdditionalRepo extends JpaRepository<AdditionalDetails, Integer> {
}