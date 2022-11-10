package com.example.nacosprovider2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${server.port}")
    public String serverPort;

    @GetMapping(value = "/nacos")
    public String getServerPort(){
        return "hello nacos:" + serverPort;
    }
}
