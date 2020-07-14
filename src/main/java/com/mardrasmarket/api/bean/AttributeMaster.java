package com.mardrasmarket.api.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AttributeMaster {


	@Id
	private int attribute_id;
	private String attribute_name;
	public AttributeMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AttributeMaster(int attribute_id, String attribute_name) {
		super();
		this.attribute_id = attribute_id;
		this.attribute_name = attribute_name;
	}
	public int getAttribute_id() {
		return attribute_id;
	}
	public void setAttribute_id(int attribute_id) {
		this.attribute_id = attribute_id;
	}
	public String getAttribute_name() {
		return attribute_name;
	}
	public void setAttribute_name(String attribute_name) {
		this.attribute_name = attribute_name;
	}
	
	
}
