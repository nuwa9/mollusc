package com.nuwa9.mollusc.service;

import com.nuwa9.mollusc.model.Order;
import com.nuwa9.mollusc.model.OrderStatus;
import com.nuwa9.mollusc.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OrderService {

  @Autowired
  private OrderRepository orderRepository;

  public List<Order> findAll() {
    return orderRepository.findAll();
  }

  public Optional<Order> findById(UUID id) {
    return orderRepository.findById(id);
  }

  public List<Order> findByUserId(UUID id) {
    return orderRepository.findByUserId(id);
  }

  public List<Order> findByStatus(OrderStatus orderStatus) {
    return orderRepository.findByStatus(orderStatus);
  }

  public List<Order> findByCreatedAt(OffsetDateTime offsetDateTime) {
    return orderRepository.findByCreatedAt(offsetDateTime);
  }

  public List<Order> findByCreatedAtAfter(OffsetDateTime offsetDateTime) {
    return orderRepository.findByCreatedAtAfter(offsetDateTime);
  }
}
