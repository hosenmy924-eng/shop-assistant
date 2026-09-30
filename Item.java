package com.example.shopassistant;

public class Item {
    private String name;
    private double wholesalePrice;
    private int quantity;

    public Item(String name, double wholesalePrice, int quantity) {
        this.name = name;
        this.wholesalePrice = wholesalePrice;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public int getQuantity() {
        return quantity;
    }
}
