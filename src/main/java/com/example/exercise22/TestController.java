package com.example.exercise22;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final TestClass testClass;

    public TestController(TestClass testClass) {
        this.testClass = testClass;
    }

    @GetMapping("/secured/admin")
    public void securedAdmin() {
        testClass.securedMethod(Role.ADMIN);
    }

    @GetMapping("/secured/user")
    public void securedUser() {
        testClass.securedMethod(Role.USER);
    }

    @GetMapping("/loggable")
    public void loggable() {
        testClass.loggableMethod();
    }
}
