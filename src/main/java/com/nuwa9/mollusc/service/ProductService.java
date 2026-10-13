package com.nuwa9.mollusc.service;

import com.nuwa9.mollusc.model.Product;
import com.nuwa9.mollusc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {

  @Autowired
  private ProductRepository productRepository;

  public List<Product> findAll() {
    return productRepository.findAll();
  }

  public Optional<Product> findById(UUID id) {
    return productRepository.findById(id);
  }

  public Optional<Product> findBySku(UUID sku) {
    return productRepository.findBySku(sku);
  }

  public List<Product> findByName(String name) {
    return productRepository.findByName(name);
  }

  public List<Product> findByCategoryId(UUID id) {
    return productRepository.findByCategoryId(id);
  }
}
