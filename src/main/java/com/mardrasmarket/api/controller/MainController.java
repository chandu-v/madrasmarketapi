package com.mardrasmarket.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mardrasmarket.api.bean.Collection;
import com.mardrasmarket.api.service.CollectionService;


@RestController
public class MainController {


	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	
	
}
