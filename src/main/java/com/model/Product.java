package com.model;

public class Product {
    private int id;
    private String product_name;
    private int price;
    private int quantity;

    public Product(int product_id, String product_name, int price, int quantity) {
        this.id = product_id;
        this.product_name = product_name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product () {

    }

    public int getId() {
        return id;
    }

    public void setId(int product_id) {
        this.id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
