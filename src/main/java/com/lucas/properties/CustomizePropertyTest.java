package com.lucas.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomizePropertyTest {
    public static void main(String[] args) {
        SpringApplication application=new SpringApplication(CustomizePropertyTest.class);
        application.setApplicationContextClass(CustomizeApplicationContext.class);
        application.run(args);
    }
}
