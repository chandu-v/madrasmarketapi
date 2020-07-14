package com.mardrasmarket.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mardrasmarket.api.bean.Collection;

@Repository
public interface CollectionRepository extends CrudRepository<Collection, Integer>{

	
}
