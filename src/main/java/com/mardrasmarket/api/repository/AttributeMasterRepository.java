package com.mardrasmarket.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mardrasmarket.api.bean.AttributeMaster;

@Repository
public interface AttributeMasterRepository extends CrudRepository<AttributeMaster, Integer>{

}
