package com.example.psoft20182.model.produto;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import aj.org.objectweb.asm.Type;

public class Lot {
	
	@Column(name = "id")
	private String id;
	
	@Column(name = "date")
	private int date;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "category")
	private Type category;
	
	
	public Lot(String id, int date, int quant, Type category) {
		this.id = id;
		this.date = date;
		this.quantity = quant;
		this.category = category;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getDate() {
		return date;
	}


	public void setDate(int date) {
		this.date = date;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Type getCategory() {
		return category;
	}


	public void setCategory(Type category) {
		this.category = category;
	}
	

}