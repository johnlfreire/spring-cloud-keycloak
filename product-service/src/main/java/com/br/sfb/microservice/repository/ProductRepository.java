package com.br.sfb.microservice.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.br.sfb.microservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
