package com.nuwa9.mollusc.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Objects;

@Embeddable
public class Address {

  @NotBlank
  @Size(max = 100)
  @Column(name = "street_line1", nullable = false, length = 100)
  private String streetLine1;

  @Size(max = 100)
  @Column(name = "street_line2", length = 100) // Optional (Apartment, Suite, etc.)
  private String streetLine2;

  @NotBlank
  @Size(max = 50)
  @Column(name = "city", nullable = false, length = 50)
  private String city;

  @NotBlank
  @Size(max = 50)
  @Column(name = "state_province", nullable = false, length = 50)
  private String stateProvince;

  @NotBlank
  @Size(max = 20)
  @Column(name = "postal_code", nullable = false, length = 20)
  // VARCHAR safely handles alphanumeric international codes (e.g., UK/Canada)
  private String postalCode;

  @NotBlank
  @Size(max = 2)
  @Column(name = "country_code", nullable = false, length = 2) // ISO 2-letter country code (e.g., US, CA, GB)
  private String countryCode;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;

    if (!(o instanceof Address other)) return false;

    return Objects.equals(this.streetLine1, other.streetLine1) &&
        Objects.equals(this.streetLine2, other.streetLine2) &&
        Objects.equals(this.city, other.city) &&
        Objects.equals(this.stateProvince, other.stateProvince) &&
        Objects.equals(this.postalCode, other.postalCode) &&
        Objects.equals(this.countryCode, other.countryCode);
  }
}