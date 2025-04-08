package com.adi117.demo.product.service;

import com.adi117.demo.product.entity.Product;

import java.util.List;

public interface ProductService {
  List<Product> getProducts();
  Product addProduct(Product product);
}
