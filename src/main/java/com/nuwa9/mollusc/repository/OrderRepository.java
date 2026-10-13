package com.nuwa9.mollusc.repository;

import com.nuwa9.mollusc.model.Order;
import com.nuwa9.mollusc.model.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<Order, UUID> {

  List<Order> findByUserId(UUID id);

  List<Order> findByStatus(OrderStatus orderStatus);

  List<Order> findByCreatedAt(OffsetDateTime offsetDateTime);

  List<Order> findByCreatedAtAfter(OffsetDateTime offsetDateTime);
}
