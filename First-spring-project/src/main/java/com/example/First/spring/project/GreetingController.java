package com.example.First.spring.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private GreetingService greetingService;


    @Autowired
    public GreetingController(@Qualifier(value = "Hindi")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greetInEnglish")
    public String greet() {
        return greetingService.greet();
    }
}
