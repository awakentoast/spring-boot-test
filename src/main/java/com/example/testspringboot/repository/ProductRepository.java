package com.example.testspringboot.repository;

import com.example.testspringboot.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
