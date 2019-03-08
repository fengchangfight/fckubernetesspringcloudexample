package com.example.fccallersvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CallerController {

    private final RestTemplate restTemplate;

    @Autowired
    public CallerController(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }


    @GetMapping("/")
    public String callBase(){
        System.out.println( "I am calling base 2..");
        Object result = restTemplate.getForObject("http://fcbase", String.class);
        return result.toString();
    }
}
