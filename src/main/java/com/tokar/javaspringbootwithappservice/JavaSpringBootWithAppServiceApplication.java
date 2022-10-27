package com.tokar.javaspringbootwithappservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(MessageProperties.class)
@SpringBootApplication
public class JavaSpringBootWithAppServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSpringBootWithAppServiceApplication.class, args);
    }

}
