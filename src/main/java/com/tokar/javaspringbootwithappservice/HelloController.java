package com.tokar.javaspringbootwithappservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final MessageProperties properties;

    public HelloController(MessageProperties properties) {
        this.properties = properties;
    }

    @GetMapping("message")
    public String getMessage() {
        return "Message: " + properties.getMessage();
    }

    @GetMapping("password")
    public String getPassword() {
        return "Password: " + properties.getPassword();
    }

    @GetMapping("secretpassword")
    public String getSecretPassword() {
        return "Password: " + properties.getSecretpassword();
    }
}