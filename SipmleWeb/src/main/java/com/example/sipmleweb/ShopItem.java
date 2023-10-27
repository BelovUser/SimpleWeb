package com.example.sipmleweb;

public class ShopItem {
    private String name;
    private String description;
    private int price;
    private int quantityOfStock;


    public ShopItem(String name, String description, int price, int quantityOfStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
    }
}
