package com.soft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/cnu")
    public String saveuser(){

        return "save user data";
    }
}
