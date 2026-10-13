package com.nuwa9.mollusc.service;

import com.nuwa9.mollusc.model.User;
import com.nuwa9.mollusc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public List<User> findAll() {
    return userRepository.findAll();
  }

  public List<User> findByEmail(String email) {
    return userRepository.findByEmail(email);
  }

  public List<User> findByFirstName(String firstName) {
    return userRepository.findByFirstName(firstName);
  }

  public List<User> findByLastName(String lastName) {
    return userRepository.findByLastName(lastName);
  }

  public List<User> findByCreatedAt(OffsetDateTime offsetDateTime) {
    return userRepository.findByCreatedAt(offsetDateTime);
  }

  public List<User> findByCreatedAtAfter(OffsetDateTime offsetDateTime) {
    return userRepository.findByCreatedAtAfter(offsetDateTime);
  }
}
