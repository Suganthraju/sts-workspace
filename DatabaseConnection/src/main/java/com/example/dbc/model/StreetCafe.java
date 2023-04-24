package com.example.dbc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StreetCafe")
public class StreetCafe 
{
	   @Id
	   private int a_type;
	   private String b_name;
	   private String c_addons;
	   private String d_size;
	   private int e_price;
	   private int f_rating;
	   private String g_servicemode;
	   private String h_payment;
	   
	   
	public int getA_type() {
		return a_type;
	}
	public void setA_type(int a_type) {
		this.a_type = a_type;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getC_addons() {
		return c_addons;
	}
	public void setC_addons(String c_addons) {
		this.c_addons = c_addons;
	}
	public String getD_size() {
		return d_size;
	}
	public void setD_size(String d_size) {
		this.d_size = d_size;
	}
	public int getE_price() {
		return e_price;
	}
	public void setE_price(int e_price) {
		this.e_price = e_price;
	}
	public int getF_rating() {
		return f_rating;
	}
	public void setF_rating(int f_rating) {
		this.f_rating = f_rating;
	}
	public String getG_servicemode() {
		return g_servicemode;
	}
	public void setG_servicemode(String g_servicemode) {
		this.g_servicemode = g_servicemode;
	}
	public String getH_payment() {
		return h_payment;
	}
	public void setE_payment(String h_payment) {
		this.h_payment = h_payment;
	}
	   
	
}
