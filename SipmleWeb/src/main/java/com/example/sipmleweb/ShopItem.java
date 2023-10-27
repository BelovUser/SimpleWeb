package com.example.sipmleweb;

public class ShopItem {
    private String name;
    private String description;
    private double price;
    private int quantityOfStock;



    public ShopItem(String name, String description, double price, int quantityOfStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityOfStock() {
        return quantityOfStock;
    }

    public String getFormatedPrice() {
        return  String.format("%.1f", this.price) + " Kč";
    }
}
