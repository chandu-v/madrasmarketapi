package com.mardrasmarket.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mardrasmarket.api.bean.Attribute_Master;
import com.mardrasmarket.api.service.Attribute_MasterService;

@RestController
public class AttributeMasterController {

	@Autowired
	Attribute_MasterService service;
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE,value="/attributes_master")
	public List<Attribute_Master> getAllAttributesMaster() {
		List<Attribute_Master> list = service.getAllAttributeMaster();
		for(Attribute_Master item : list) {
			System.out.println(item.toString());
		}
		return 	list;
	}
	
}
