package com.mardrasmarket.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mardrasmarket.api.bean.AttributeMaster;
import com.mardrasmarket.api.service.AttributeMasterService;

@RestController
public class AttributeMasterController {

	@Autowired
	AttributeMasterService attributeMasterService;
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE,value="/attributes")
	public List<AttributeMaster> getAll(){
		return attributeMasterService.getAll();
	}
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/attributes/{id}")
	public Optional<AttributeMaster> getAttributeById(@PathVariable int id){
		return attributeMasterService.getAttributeById(id);
	}
}
