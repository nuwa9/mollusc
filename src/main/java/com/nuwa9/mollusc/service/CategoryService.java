package com.nuwa9.mollusc.service;

import com.nuwa9.mollusc.model.Category;
import com.nuwa9.mollusc.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CategoryService {

  @Autowired
  private CategoryRepository categoryRepository;

  public List<Category> findAll() {
    return categoryRepository.findAll();
  }

  public Optional<Category> findById(UUID id) {
    return categoryRepository.findById(id);
  }

  public Optional<Category> findByName(String name) {
    return categoryRepository.findByName(name);
  }

  public Category saveCategory(Category category) {
    return categoryRepository.save(category);
  }
}
