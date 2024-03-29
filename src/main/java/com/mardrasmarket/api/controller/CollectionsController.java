package com.mardrasmarket.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mardrasmarket.api.bean.Collection;
import com.mardrasmarket.api.bean.User;
import com.mardrasmarket.api.service.CollectionService;

@RestController
public class CollectionsController {
	
	@Autowired
	CollectionService collectionService;
	

	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE,value="/collections")
		public @ResponseBody List<Collection> getCollections(){
		List<Collection> list = collectionService.getCollections();
		return list;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/register_collection")
	public Collection registerUser(@RequestBody Collection collection) {
		System.out.println(String.format("In Controller : name %S", collection.getCollection_name()));
		return collectionService.registerCollection(collection);
		/*
		 * if(collectionService.registerCollection(collection) == 1) { return
		 * "REGISTERED"; }else { return "FAILED"; }
		 */
	}
}
