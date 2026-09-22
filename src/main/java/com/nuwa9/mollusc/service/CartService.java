package com.nuwa9.mollusc.service;

import com.nuwa9.mollusc.model.Cart;
import com.nuwa9.mollusc.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CartService {

  @Autowired
  private CartRepository cartRepository;

  public List<Cart> findAll() {
    return cartRepository.findAll();
  }

  public Optional<Cart> findById(UUID id) {
    return cartRepository.findById(id);
  }

  public List<Cart> findByUserId(UUID userId) {
    return cartRepository.findByUserId(userId);
  }

  public List<Cart> findByProductId(UUID productId) {
    return cartRepository.findByProductId(productId);
  }

  public Cart saveCart(Cart cart) {
    return cartRepository.save(cart);
  }
}
