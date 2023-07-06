package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class qqq {
    @GetMapping("/test")
    public String qq(){
        return "hello";
    }


}
