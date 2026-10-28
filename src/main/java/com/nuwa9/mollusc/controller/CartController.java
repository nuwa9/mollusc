package com.nuwa9.mollusc.controller;

import com.nuwa9.mollusc.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cart")
public class CartController {

  private CartService cartService;

  @GetMapping("/")
  public String helloWorld() {
    return "Hello World";
  }
}
