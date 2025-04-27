package com.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/test")
    public Map<String, String> testApi() {
        return Collections.singletonMap("message", "Hello from API service!");
    }

    @GetMapping("/error")
    public Map<String, String> testError() {
        throw new RuntimeException("Simulated Internal Server Error");
    }

}
