package com.nuwa9.mollusc.service;

import com.nuwa9.mollusc.model.OrderItem;
import com.nuwa9.mollusc.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OrderItemService {

  @Autowired
  private OrderItemRepository orderItemRepository;

  public List<OrderItem> findAll() {
    return orderItemRepository.findAll();
  }

  public Optional<OrderItem> findById(UUID id) {
    return orderItemRepository.findById(id);
  }

  public List<OrderItem> findByOrderId(UUID id) {
    return orderItemRepository.findByOrderId(id);
  }

  public List<OrderItem> findByProductId(UUID id) {
    return orderItemRepository.findByProductId(id);
  }
}
