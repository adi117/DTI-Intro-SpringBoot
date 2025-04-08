package com.adi117.demo.cart.service;


import com.adi117.demo.cart.entity.Cart;

import java.util.List;

public interface CartService {
  List<Cart> getCarts();
  Cart addCart(Cart product);
}
