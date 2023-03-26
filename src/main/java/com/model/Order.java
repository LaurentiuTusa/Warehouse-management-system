package com.model;

public class Order {
    private int id;
    private int cl_id;
    private int prod_id;
    private int amount;

    public Order(int order_id, int cl_id, int prod_id, int amount) {
        this.id = order_id;
        this.cl_id = cl_id;
        this.prod_id = prod_id;
        this.amount = amount;
    }

    public Order () {

    }

    public int getId() {
        return id;
    }

    public void setId(int order_id) {
        this.id = order_id;
    }

    public int getCl_id() {
        return cl_id;
    }

    public void setCl_id(int cl_id) {
        this.cl_id = cl_id;
    }

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
