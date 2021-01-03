package com.pattana.security.repositories;

import org.springframework.data.repository.CrudRepository;

import com.pattana.security.models.Product;

public interface ProductRepository extends CrudRepository<Product, String> {
	
	@Override
    void delete(Product deleted);
}
