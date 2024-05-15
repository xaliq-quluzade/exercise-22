package com.example.exercise22;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Exercise22Application {
    public static void main(String[] args) {
        SpringApplication.run(Exercise22Application.class, args);
    }
}
