package com.mardrasmarket.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mardrasmarket.api.repository.AttributeMasterRepository;
import com.mardrasmarket.api.bean.AttributeMaster;
import java.util.List;
import java.util.Optional;


@Service
public class AttributeMasterService {

	@Autowired
	AttributeMasterRepository attributeMasterRepository;

	public List<AttributeMaster> getAll() {
		return (List<AttributeMaster>) attributeMasterRepository.findAll();
	}

	public Optional<AttributeMaster> getAttributeById(int id) {
		return attributeMasterRepository.findById(id);
	}
	
}
