package com.tokar.javaspringbootwithappservice;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "config")
public @Data class MessageProperties {
    private String message;
    private String password;
    private String secretpassword;
}



