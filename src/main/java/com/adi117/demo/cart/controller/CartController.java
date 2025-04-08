package com.adi117.demo.cart.controller;

import com.adi117.demo.cart.entity.Cart;
import com.adi117.demo.cart.service.CartService;
import com.adi117.demo.product.entity.Product;
import com.adi117.demo.product.service.ProductService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cart")
public class CartController {

  private final CartService cartService;

  public CartController(CartService cartService) {
    this.cartService = cartService;
  }

  @GetMapping
  public List<Cart> getProducts() {
    return cartService.getCarts();
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public Cart addProduct(@RequestBody Cart product) {
    return cartService.addCart(product);
  }
}
