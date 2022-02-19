package com.example.demo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testingController {

    @GetMapping("/")
    public String test() {
        return "gbggttttbgb";
    }
}