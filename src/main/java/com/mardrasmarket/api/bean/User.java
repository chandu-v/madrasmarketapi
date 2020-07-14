package com.mardrasmarket.api.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`user`")
public class User {

	@Id
	private int user_id;
	private String first_name;
	private String last_name;
	private String dob;
	private String phone_number;
	private String email_id;
	private String password;
	
	public User() {
		super();
	}
	
	
	public User(String first_name, String phone_number, String email_id, String password) {
		super();
		this.first_name = first_name;
		this.phone_number = phone_number;
		this.email_id = email_id;
		this.password = password;
	}


	public User(int user_id, String first_name, String last_name, String dob, String phone_number, String email_id,
			String password) {
		super();
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.dob = dob;
		this.phone_number = phone_number;
		this.email_id = email_id;
		this.password = password;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
