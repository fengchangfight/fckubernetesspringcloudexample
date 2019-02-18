package com.example.fcbasesvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseEchoController {
    @GetMapping("/")
    public String echoHello(){
        return "Hello bitch";
    }
}
