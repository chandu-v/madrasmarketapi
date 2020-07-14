package com.mardrasmarket.api.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.mardrasmarket.api.bean.Product;
import com.mardrasmarket.api.bean.Product_Embedded_Id;

public interface ProductRepository extends CrudRepository<Product, Product_Embedded_Id>{
	@Query(
			  value = "SELECT * FROM product u WHERE u.product_id = :id", 
			  nativeQuery = true)
			Collection<Product> getProductAttributesByProductId(int id);
}
