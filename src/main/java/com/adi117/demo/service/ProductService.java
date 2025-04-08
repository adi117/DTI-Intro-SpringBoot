package com.adi117.demo.service;

import com.adi117.demo.model.Products;

import java.util.List;

public interface ProductService {
  List<Products> getProducts();
  Products addProduct(Products product);
}
