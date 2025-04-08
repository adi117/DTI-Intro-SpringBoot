package com.adi117.demo.model;

public class Products {
  private String name;
  private int price;
  private int stock;

  public Products () {}

  public Products(String name, int price, int stock) {
    this.name = name;
    this.price = price;
    this.stock = stock;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }

  public int getStock() {
    return stock;
  }
  public void setStock(int stock) {
    this.stock = stock;
  }
}
