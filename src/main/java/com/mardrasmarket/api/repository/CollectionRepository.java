package com.mardrasmarket.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mardrasmarket.api.bean.Collection;

@Repository
public interface CollectionRepository extends CrudRepository<Collection, Integer>{

	@Query(
			value = "INSERT INTO COLLECTION (COLLECTION_NAME) VALUES (:collectionName)",
			nativeQuery = true)
	void insertCollection(String collectionName);
	
}
