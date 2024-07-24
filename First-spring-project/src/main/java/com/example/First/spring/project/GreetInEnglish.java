package com.example.First.spring.project;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Qualifier("English")
@Component
public class GreetInEnglish implements GreetingService{
    @Override
    public String greet() {
        return "Good Morning";
    }
}
