package com.mardrasmarket.api.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Collection {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int collection_id;
	private String collection_name;
	
	
	public Collection() {
		super();
	}
	public Collection(int collection_id, String collection_name) {
		super();
		this.collection_id = collection_id;
		this.collection_name = collection_name;
	}
	public int getCollection_id() {
		return collection_id;
	}
	public void setCollection_id(int collection_id) {
		this.collection_id = collection_id;
	}
	public String getCollection_name() {
		return collection_name;
	}
	public void setCollection_name(String collection_name) {
		this.collection_name = collection_name;
	}
	
	@Override
	public String toString() {
		return "{ 'id'"+this.collection_id+",'name':"+this.collection_name+"}";
	
	}
	
}
