package com.mardrasmarket.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mardrasmarket.api.bean.Product;
import com.mardrasmarket.api.bean.Product_Embedded_Id;
import com.mardrasmarket.api.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public List<Product> getAllProducts() {
		return (List<Product>) productRepository.findAll();
	}

	public Optional<Product> getProductById(int id,int attribute_id) {
		Product_Embedded_Id product_Embedded_Id = new Product_Embedded_Id(id, attribute_id);
		return productRepository.findById(product_Embedded_Id);
	}

	public List<Product> getProductAttibutesByProductId(int id) {
		return (List<Product>) productRepository.getProductAttributesByProductId(id);
	}
	
	
}
