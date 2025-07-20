package com.tranquyen.store2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "dm_product")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product
{
  @Id
  @Column(nullable = false,updatable = false)
  private long id;
  @Column(name ="name",length = 100)
  private String name;
  @Column(name = "price")
  private double price;

}
