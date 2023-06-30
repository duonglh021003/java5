package com.example.demo.buoi9.service;

import com.example.demo.buoi9.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {

    List<Category>getAll();

    void add(Category category);

    void update(Category category,Long id);

    void delete (Long id);

    Category getById(Long id);
}
