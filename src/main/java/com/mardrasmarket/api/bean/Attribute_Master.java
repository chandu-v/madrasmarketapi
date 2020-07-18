package com.mardrasmarket.api.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "attribute_master")
public class Attribute_Master {

	@Id
	private int attribute_id;
	private String attribute_name;
	public Attribute_Master(int attribute_id, String attribute_name) {
		super();
		this.attribute_id = attribute_id;
		this.attribute_name = attribute_name;
	}
	public Attribute_Master() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected int getAttribute_id() {
		return attribute_id;
	}
	protected void setAttribute_id(int attribute_id) {
		this.attribute_id = attribute_id;
	}
	protected String getAttribute_name() {
		return attribute_name;
	}
	protected void setAttribute_name(String attribute_name) {
		this.attribute_name = attribute_name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("{'id':%S,'name':%S}", this.attribute_id,this.attribute_name);
	}
	
}
