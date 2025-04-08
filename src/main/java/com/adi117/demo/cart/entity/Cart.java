package com.adi117.demo.cart.entity;

import com.adi117.demo.product.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
  private int id;
  private List<Product> productList;
}
