package com.mardrasmarket.api.bean;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Product_Embedded_Id implements Serializable{
	
	private int product_id;
	private int attribute_id;
	
	public Product_Embedded_Id() {
		super();
	}
	public Product_Embedded_Id(int product_id, int attribute_id) {
		super();
		this.product_id = product_id;
		this.attribute_id = attribute_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getAttribute_id() {
		return attribute_id;
	}
	public void setAttribute_id(int attribute_id) {
		this.attribute_id = attribute_id;
	}
	
	

}
