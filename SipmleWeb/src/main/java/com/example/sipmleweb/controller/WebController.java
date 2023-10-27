package com.example.sipmleweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

    @GetMapping("/webshop")
    public String helloWorld(){
        return "helloworld";
    }

    @GetMapping("/home")
    public String websiteHome(){
        return "header";
    }
}
