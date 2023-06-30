package com.example.demo.buoi9.service.impl;

import com.example.demo.buoi9.entity.Category;
import com.example.demo.buoi9.repository.CategoryRepository;
import com.example.demo.buoi9.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void add(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void update(Category category,Long id) {
        categoryRepository.save(category);
    }

    @Override
    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Category getById(Long id) {
        for (Category category :categoryRepository.findAll()){
            if(category.getId().equals(id)){
                return category;
            }
        }
        return null;

    }


}
