package com.imdad.cakestroy.service;

import com.imdad.cakestroy.model.Category;
import com.imdad.cakestroy.respository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Categoryservice {
    @Autowired
    CategoryRepository categoryRepository;
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }
    public void removeCategoryById(int id) {categoryRepository.deleteById(id);}
    public Optional<Category> getCategoryById(int id){ return categoryRepository.findById(id);}
}
