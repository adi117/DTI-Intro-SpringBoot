package com.adi117.demo.product.service;

import com.adi117.demo.product.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

  private final List<Product> products = new ArrayList<>();

  @Override
  public List<Product> getProducts () {
    return products;
  }

  @Override
  public Product addProduct(Product product) {
    products.add(product);
    return product;
  }
}
