package com.example.nacosconsumer8010.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

    @Value("${service-url.nacos-user-service}")
    private String serviceURL;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "consumer/nacos")
    public String getDiscover(){
        return restTemplate.getForObject(serviceURL + "/nacos", String.class);
    }
}
