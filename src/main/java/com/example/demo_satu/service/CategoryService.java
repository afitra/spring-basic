package com.example.demo_satu.service;

import com.example.demo_satu.repository.CategoryRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoryService {
    @Getter
    private CategoryRepository categoryRepository;

    @Autowired
    public void setCategoryRepository(CategoryRepository inputRepository) {
        this.categoryRepository = inputRepository;
    }
}
