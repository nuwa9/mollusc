package com.nuwa9.mollusc.repository;

import com.nuwa9.mollusc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

  List<User> findByEmail(String email);

  List<User> findByFirstName(String firstName);

  List<User> findByLastName(String lastName);

  List<User> findByCreatedAt(OffsetDateTime offsetDateTime);

  List<User> findByCreatedAtAfter(OffsetDateTime offsetDateTime);
}
