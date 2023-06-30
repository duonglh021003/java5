package com.example.demo.buoi9.service.impl;

import com.example.demo.buoi9.entity.Product;
import com.example.demo.buoi9.repository.ProductRepository;
import com.example.demo.buoi9.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }


    @Override
    public void add(Product product) {
        productRepository.save(product);
    }
}
