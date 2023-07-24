package com.example.dbc.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dbc.model.StreetCafe;

@Repository
public interface StreetCaferepo extends JpaRepository<StreetCafe, Integer> {
}
