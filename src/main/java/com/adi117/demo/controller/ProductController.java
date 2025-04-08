package com.adi117.demo.controller;

import com.adi117.demo.model.Products;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

  private final List<Products> products = new ArrayList<>();

  @GetMapping
  public List<Products> getProducts() {
    return products;
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public Products addProduct(@RequestBody Products product) {
    products.add(product);
    return product;
  }
}
