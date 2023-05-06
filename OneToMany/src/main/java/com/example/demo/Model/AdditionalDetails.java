package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AdditionalDetails {
	
	@Id
	private int id;
	private String quantity;
	private int scoup;
	private String addons;
	private int price;
	private String serve;
	
	public String getServe() {
		return serve;
	}
	public void setServe(String serve) {
		this.serve = serve;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public int getScoup() {
		return scoup;
	}
	public void setScoup(int scoup) {
		this.scoup = scoup;
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

}
