package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.IceCream;

public interface IceCreamRepo extends JpaRepository<IceCream ,Integer> {

}
