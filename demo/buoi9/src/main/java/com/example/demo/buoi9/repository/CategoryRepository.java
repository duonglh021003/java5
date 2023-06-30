package com.example.demo.buoi9.repository;

import com.example.demo.buoi9.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    // CRUD 1 bang => K CAN PHAN VIET
}
