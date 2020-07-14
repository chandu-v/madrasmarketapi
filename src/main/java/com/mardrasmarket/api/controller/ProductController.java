package com.mardrasmarket.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mardrasmarket.api.bean.Product;
import com.mardrasmarket.api.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value="/products")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE,value="/product/{id}")
	public List<Product> getProductAttributesByProductId(@PathVariable int id){
		return productService.getProductAttibutesByProductId(id);
	}
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value="/product/{id}/{attribute_id}")
	public Optional<Product> getProductById(@PathVariable int id,@PathVariable int attribute_id){
		return productService.getProductById(id,attribute_id);
	}
}
