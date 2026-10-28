package com.nuwa9.mollusc.controller;

import com.nuwa9.mollusc.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

  private ProductService productService;

  @GetMapping("/")
  public String helloWorld() {
    return "Hello World";
  }
}
