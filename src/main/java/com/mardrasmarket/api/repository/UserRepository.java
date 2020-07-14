package com.mardrasmarket.api.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mardrasmarket.api.bean.User;

@Repository
public class UserRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	/*
	 * @Query( value =
	 * "INSERT INTO [USER] (first_name ,email_id ,phone_number ,password ) VALUES (':firstName',':emailId',':phoneNumber',':password')"
	 * , nativeQuery = true)
	 */
	public int insertUser(String firstName, String emailId, String phoneNumber, String password) {
		return jdbcTemplate.update( "INSERT INTO [USER] (first_name ,email_id ,phone_number ,password ) VALUES (?,?,?,?)",
				firstName,emailId,phoneNumber,password);
	}

	
}
