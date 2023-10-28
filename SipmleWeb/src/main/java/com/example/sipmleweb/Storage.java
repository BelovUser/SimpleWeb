package com.example.sipmleweb;

import com.example.sipmleweb.ShopItem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Storage {

    List<ShopItem> storage = new ArrayList<>();

    public List<ShopItem> getStorage() {
        return storage;
    }

    public void addToStorage(ShopItem shopItem) {
        storage.add(shopItem);
    }


    public List<ShopItem> availableItem() {
         return this.storage.stream()
                .filter(item -> item.getQuantityOfStock() != 0 )
                .collect(Collectors.toList());
    }

    public double getAverage() {
        return this.storage.stream()
                .mapToDouble(ShopItem::getQuantityOfStock)
                .average()
                .orElse(0.0);
    }

    public List<ShopItem> filterByName(String name){
        return this.storage.stream()
                .filter(item -> item.getName()git .equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }
}
