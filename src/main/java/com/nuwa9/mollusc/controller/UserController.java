package com.nuwa9.mollusc.controller;

import com.nuwa9.mollusc.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

  private UserService userService;

  @GetMapping("/")
  public String helloWorld() {
    return "Hello World";
  }
}
