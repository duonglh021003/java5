package com.example.demo.buoi9.service;

import com.example.demo.buoi9.entity.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {

    List<Product> getAll();

    void add(Product product);


}
