package com.mardrasmarket.api.bean;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Product {

	
	@EmbeddedId
	private Product_Embedded_Id product_Embedded_Id;
	private String value;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Product_Embedded_Id product_Embedded_Id, String value) {
		super();
		this.product_Embedded_Id = product_Embedded_Id;
		this.value = value;
	}
	public Product_Embedded_Id getProduct_Embedded_Id() {
		return product_Embedded_Id;
	}
	public void setProduct_Embedded_Id(Product_Embedded_Id product_Embedded_Id) {
		this.product_Embedded_Id = product_Embedded_Id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
