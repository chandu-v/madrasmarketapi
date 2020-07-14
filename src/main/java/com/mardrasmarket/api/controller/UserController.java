package com.mardrasmarket.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mardrasmarket.api.bean.User;
import com.mardrasmarket.api.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	/*
	 * @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value =
	 * "/users") public List<User> getAll(){ return userService.getAll(); }
	 * 
	 * @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value =
	 * "/users/{id}") public Optional<User> getUserById(@PathVariable int id){
	 * return userService.getUserById(id); }
	 * 
	 *//*
		 * @RequestMapping(method = RequestMethod.POST, value = "/register_user") public
		 * void registerUser(@RequestParam(value = "name") String name,
		 * 
		 * @RequestParam(value ="email") String email,
		 * 
		 * @RequestParam(value ="mobile") String mobile,
		 * 
		 * @RequestParam(value = "password") String password) {
		 * System.out.println(String.
		 * format("In Controller : name %S, email %S, phone %S, password %s",
		 * name,email,mobile,password)); User user = new User();
		 * user.setEmail_id(email); user.setFirst_name(name);
		 * user.setPhone_number(mobile); user.setPassword(password);
		 * userService.registerUser(user); }
		 */
	
	@RequestMapping(method = RequestMethod.POST, value = "/register_user")
	public String registerUser(@RequestBody User user) {
		System.out.println(String.format("In Controller : name %S, email %S, phone %S, password %S", user.getFirst_name(),user.getEmail_id(),user.getPhone_number(),user.getPassword()));
		if(userService.registerUser(user) == 1) {
			return "REGISTERED";
		}else {
			return "FAILED";
		}
	}
}
