package com.mardrasmarket.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mardrasmarket.api.bean.Collection;
import com.mardrasmarket.api.repository.CollectionRepository;

@Service
public class CollectionService {

	@Autowired
	CollectionRepository collectionRepository;
	
	public List<Collection> getCollections() {
		return  (List<Collection>) collectionRepository.findAll();
	}

	public Collection registerCollection(Collection collection) {
		
		 return collectionRepository.save(collection);
//		 (collection.getCollection_name());
	}
	
	

}
