package com.example.testspringboot.controller;


import com.example.testspringboot.entity.Product;
import com.example.testspringboot.repository.ProductRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api")
public class Controller {
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(Controller.class);
    private final ProductRepository productRepository;

    public Controller(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    @GetMapping("/product")
    public List<Product> getALlProducts() {
        List<Product> products = new ArrayList<>();
        try {
            Iterable<Product> productIterable = productRepository.findAll();
            productIterable.forEach(products::add);
        } catch (Exception e) {
            logger.info("{} error in get products", e.toString());
            products.add(null);
        }

        return products;
    }

    @PostMapping("/product")
    public void saveProduct(@RequestBody Product product) {
        productRepository.save(product);
    }
}
