package com.tranquyen.store2.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class ProductRequestDTO implements Serializable
{
  @NotBlank(message = "name must be not blank")
  private String name;
  @PositiveOrZero(message = "price must be greater than 0")
  private double price;

}
