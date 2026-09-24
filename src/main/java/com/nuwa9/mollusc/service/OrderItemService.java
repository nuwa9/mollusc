package com.nuwa9.mollusc.service;

import com.nuwa9.mollusc.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemService {

  @Autowired
  private OrderItemRepository orderItemRepository;

}
