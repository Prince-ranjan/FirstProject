package com.example.First.spring.project;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Qualifier("Hindi")
@Component
public class GreetInHindi implements GreetingService{
    @Override
    public String greet() {
        return "Suprabhat";
    }
}
