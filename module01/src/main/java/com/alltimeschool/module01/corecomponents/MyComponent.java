package com.alltimeschool.module01.corecomponents;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    public String greet() {
        return "Hello from MyComponent!";
    }
}
