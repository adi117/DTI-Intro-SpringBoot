package com.adi117.demo.controller;

import com.adi117.demo.model.Products;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

  @GetMapping(value = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
  public Products getProducts() {
    return new Products("Ice Tea", 3000, 10);
  }
}
