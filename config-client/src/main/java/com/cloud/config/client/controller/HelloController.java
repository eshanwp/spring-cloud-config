package com.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Value("${welcome.message}")
    String welcomeText;

    @GetMapping(value = "/welcome")
    public String welcomeText(){
        return welcomeText;
    }
}
