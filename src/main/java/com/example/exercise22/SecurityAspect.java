package com.example.exercise22;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecurityAspect {
    @Before("@annotation(secured) && args(role)")
    public void checkAuthorization(Role role, Secured secured) {
        Role allowedRole = secured.value();
        if (allowedRole == role) {
            System.out.println("Authorized");
        } else {
            System.out.println("Not Authorized");
        }
    }
}
