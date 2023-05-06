package com.example.demo.Model;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class IceCream {
	
	@Id
	private int sno;
	private String name;
	private String pricerange;
	private String product;
	private String flavour;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<AdditionalDetails> details;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPricerange() {
		return pricerange;
	}
	public void setPricerange(String pricerange) {
		this.pricerange = pricerange;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	public List<AdditionalDetails> getDetails() {
		return details;
	}
	public void setDetails(List<AdditionalDetails> details) {
		this.details = details;
	}	
	
}
