package com.adi117.demo.cart.service;

import com.adi117.demo.cart.entity.Cart;
import com.adi117.demo.product.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartServiceImpl implements CartService{

  private List<Cart> carts = new ArrayList<>();

  @Override
  public List<Cart> getCarts() {
    return carts;
  }

  @Override
  public Cart addCart(Cart product) {
    carts.add(product);
    return product;
  }
}
