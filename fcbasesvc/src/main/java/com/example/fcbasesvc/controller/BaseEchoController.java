package com.example.fcbasesvc.controller;

import com.example.fcbasesvc.FcbasesvcApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseEchoController {
    @GetMapping("/")
    public String echoHello(){
        return "Hello hello patch";
    }

    @GetMapping("/healthcheck")
    public ResponseEntity healthCheck(){
        //return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        if((System.currentTimeMillis()-FcbasesvcApplication.startTime)>10000){
            return new ResponseEntity<>("Over 10 seconds, server down",HttpStatus.INTERNAL_SERVER_ERROR);
        }else{
            return new ResponseEntity<>("love you",HttpStatus.OK);
        }
    }
}
