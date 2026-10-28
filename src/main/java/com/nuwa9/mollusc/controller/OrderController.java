package com.nuwa9.mollusc.controller;

import com.nuwa9.mollusc.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

  private OrderService orderService;

  @GetMapping("/")
  public String helloWorld() {
    return "Hello World";
  }
}
