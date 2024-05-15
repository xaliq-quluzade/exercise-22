package com.example.exercise22;

import org.springframework.stereotype.Component;

@Component
public class TestClass {
    @Secured(Role.ADMIN)
    public void securedMethod(Role role) {
        System.out.println("Inside secured");
    }

    @Loggable(priority = Priority.HIGH)
    public void loggableMethod() {
        System.out.println("Inside loggable");
    }
}
