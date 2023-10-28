package com.example.sipmleweb.controller;

import com.example.sipmleweb.ShopItem;
import com.example.sipmleweb.Storage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class WebController {

    private final Storage storage = new Storage();

    public WebController() {
        storage.addToStorage(new ShopItem("Running shoes", "Nike running shoes for every day sport" , 1000,5));
        storage.addToStorage(new ShopItem("Printer", "some HP printer that will print pages" , 3000,2));
        storage.addToStorage(new ShopItem("Coca cola", "0.5l standard coke" , 25,0));
        storage.addToStorage(new ShopItem("Wokin", "Chiken with fried rice and Wokin sauce" , 119,100));
        storage.addToStorage(new ShopItem("T-shirt", "Blue with a corgi on a bike" , 300,1));

    }


    @GetMapping("/webshop")
    public String homeView(Model model) {
        model.addAttribute("storage",  storage.getStorage());
        return "general";
    }

    @GetMapping("/only-available")
    public String onlyAvailable(Model model){
        model.addAttribute("storage",  storage.availableItem());
    return "general";
    }

    @GetMapping("/cheapest-first")
    public String cheapestFirst(Model model){
        return "general";
    }

    @GetMapping("/average-stock")
    public String average(Model model){
        model.addAttribute("average",  storage.getAverage());
        return "average";
    }

    @PostMapping("/webshop/search-item")
    public String search(@RequestParam String item, Model model){
        model.addAttribute("storage",storage.filterByName(item));
        return "general";
    }
}
