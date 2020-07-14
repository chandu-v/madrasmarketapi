package com.mardrasmarket.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mardrasmarket.api.bean.User;
import com.mardrasmarket.api.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	/*
	 * public List<User> getAll(){ return (List<User>) userRepository.findAll(); }
	 * 
	 * public Optional<User> getUserById(int id) { return
	 * userRepository.findById(id); }
	 */
	public int registerUser(User user) {
		System.out.println(String.format("In Controller : name %S, email %S, phone %S, password %s", user.getFirst_name(),user.getEmail_id(),user.getPhone_number(),user.getPassword()));
		return userRepository.insertUser(user.getFirst_name(),user.getEmail_id(),user.getPhone_number(),user.getPassword());
	}
}
