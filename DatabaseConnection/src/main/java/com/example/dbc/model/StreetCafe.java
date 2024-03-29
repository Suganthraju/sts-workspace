package com.example.dbc.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="StreetCafe")
public class StreetCafe 
{
	   
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int id;
	   private String name;
	   private String varient;
	   private String price;
	   
	   @OneToMany(cascade = CascadeType.ALL)
	   @JoinColumn
	   private List<AdditionalDetails> details;
	   
	   
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVarient() {
		return varient;
	}
	public void setVarient(String varient) {
		this.varient = varient;
	}
 
  
	public List<AdditionalDetails> getDetails() {
		return details;
	}
	public void setDetails(List<AdditionalDetails> details) {
		this.details = details;
	}

	
	
	
}
