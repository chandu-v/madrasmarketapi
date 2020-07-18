package com.mardrasmarket.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mardrasmarket.api.bean.Attribute_Master;
import com.mardrasmarket.api.repository.Attribute_MasterRepository;

import net.minidev.json.JSONObject;

@Service
public class Attribute_MasterService {

	@Autowired
	Attribute_MasterRepository repository;
	
	public List<Attribute_Master> getAllAttributeMaster(){
		List<Attribute_Master> list = (List<Attribute_Master>) repository.findAll();
		for(Attribute_Master item: list) {
			System.out.println(item.toString());
		}
		return list;
	}
}
