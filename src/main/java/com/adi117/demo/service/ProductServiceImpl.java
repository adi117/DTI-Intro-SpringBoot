package com.adi117.demo.service;

import com.adi117.demo.model.Products;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

  private final List<Products> products = new ArrayList<>();

  @Override
  public List<Products> getProducts() {
    return products;
  }

  @Override
  public Products addProduct(Products product) {
    products.add(product);
    return product;
  }
}
