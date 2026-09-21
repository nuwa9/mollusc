package com.nuwa9.mollusc.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    private UUID sku;

    private String name;

    private String description;

    private BigDecimal price;

    private int stockQuantity;

    private UUID categoryId;

    public UUID getId() {
        return id;
    }

    public UUID getSku() {
        return sku;
    }

    public void setSku(UUID sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public UUID getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(UUID categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return id.equals(product.getId()) &&
                sku.equals(product.getSku()) &&
                name.equals(product.getName()) &&
                description.equals(product.getDescription()) &&
                price.compareTo(product.getPrice()) == 0 &&
                stockQuantity == product.getStockQuantity() &&
                categoryId.equals(product.getCategoryId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
