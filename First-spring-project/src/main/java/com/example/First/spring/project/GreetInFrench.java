package com.example.First.spring.project;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Qualifier("French")
@Component
@Primary
public class GreetInFrench implements GreetingService{
    @Override
    public String greet() {
        return "bonjour";
    }
}
