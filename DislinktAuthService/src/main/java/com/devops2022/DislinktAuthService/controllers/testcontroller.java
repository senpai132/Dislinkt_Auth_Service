package com.devops2022.DislinktAuthService.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/test")
public class testcontroller {
    @GetMapping("/comm")
    public String createAuthenticationToken() {
        return "hello friend";
    }
}
