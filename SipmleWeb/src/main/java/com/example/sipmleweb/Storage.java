package com.example.sipmleweb;

import com.example.sipmleweb.ShopItem;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    List<ShopItem> storage = new ArrayList<>();

    public void addToStorage(ShopItem shopItem) {
        storage.add(shopItem);
    }
}