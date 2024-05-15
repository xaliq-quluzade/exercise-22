package com.example.exercise22;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("@annotation(loggable)")
    public void logMethodExecution(Loggable loggable) {
        Priority priority = loggable.priority();
        System.out.println("Priority: " + priority);
    }
}
