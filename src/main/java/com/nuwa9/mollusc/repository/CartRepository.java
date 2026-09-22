package com.nuwa9.mollusc.repository;

import com.nuwa9.mollusc.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CartRepository extends JpaRepository<Cart, UUID> {

  List<Cart> findByUserId(UUID userId);

  List<Cart> findByProductId(UUID productID);

}