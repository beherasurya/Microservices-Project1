package com.app.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
