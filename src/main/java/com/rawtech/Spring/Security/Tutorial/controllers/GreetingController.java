package com.rawtech.Spring.Security.Tutorial.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingController {

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from our API.");
    }


    @GetMapping("/goodbye")
    public ResponseEntity<String> sayGoodbye() {
        return ResponseEntity.ok("Goodbye from our API.");
    }
}
