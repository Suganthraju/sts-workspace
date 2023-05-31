package com.example.dbc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AdditionalDetails {
	
	   @Id
	   private int id;
	   private String addons;
	   private int price;
	   private int quantity;
	   private String size;
	   private int rating;
	   private String servicemode;
	   private String payment;
	     
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddons() {
		return addons;
	}
	public void setAddons(String addons) {
		this.addons = addons;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getServicemode() {
		return servicemode;
	}
	public void setServicemode(String servicemode) {
		this.servicemode = servicemode;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	   
	   

}
