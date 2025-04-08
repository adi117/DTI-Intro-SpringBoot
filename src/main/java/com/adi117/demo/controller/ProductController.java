package com.adi117.demo.controller;

import com.adi117.demo.model.Products;
import com.adi117.demo.service.ProductService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping
  public List<Products> getProducts() {
    return productService.getProducts();
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public Products addProduct(@RequestBody Products product) {
    return productService.addProduct(product);
  }
}
