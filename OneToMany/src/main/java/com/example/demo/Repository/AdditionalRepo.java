package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.AdditionalDetails;

public interface AdditionalRepo extends JpaRepository<AdditionalDetails,Integer> {

}

