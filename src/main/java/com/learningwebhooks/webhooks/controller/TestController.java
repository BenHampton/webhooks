package com.learningwebhooks.webhooks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping
    public String testController() {
        return "Testing Discord Webhook";
    }
}
