package com.deploythedreams.book_rental_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/api/welcome")
    public String welcome() {
        return "Welcome to Deploy the Dreams!";
    }
}
