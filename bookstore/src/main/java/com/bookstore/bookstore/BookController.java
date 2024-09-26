package com.bookstore.bookstore;

import org.springframework.web.bind.annotation.*;
@RestController
public class BookController{
    @GetMapping("/")
    public String home() {
        return "home";
    }
}