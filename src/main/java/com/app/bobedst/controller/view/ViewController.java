package com.app.bobedst.controller.view;

import org.springframework.web.bind.annotation.GetMapping;

public class ViewController {

    @GetMapping("/")
    public String index() {
        return "index";
    }


    @GetMapping("/overview")
    public String overview() {
        return "overview";
    }
}
