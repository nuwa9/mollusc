package com.nuwa9.mollusc.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

import java.util.UUID;

@Entity
@Table(name = "carts")
public class Cart {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "id", updatable = false, nullable = false)
  private UUID id;

  private UUID userId;

  private UUID productId;

  @Min(1)
  @Max(value = 255)
  private int quantity;

  public UUID getId() {
    return id;
  }

  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public UUID getProductId() {
    return productId;
  }

  public void setProductId(UUID productId) {
    this.productId = productId;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Cart cart = (Cart) o;

    return id.equals(cart.getId()) &&
        userId.equals(cart.getUserId()) &&
        productId.equals(cart.getProductId()) &&
        quantity == cart.getQuantity();
  }

  @Override
  public int hashCode() {
    return getClass().hashCode();
  }
}
