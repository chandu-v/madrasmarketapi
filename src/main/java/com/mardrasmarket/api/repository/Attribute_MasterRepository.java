package com.mardrasmarket.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mardrasmarket.api.bean.Attribute_Master;

@Repository
public interface Attribute_MasterRepository extends CrudRepository<Attribute_Master, Integer>{

}
