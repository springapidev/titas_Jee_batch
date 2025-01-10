package com.alltimeschool.module01.corecomponents;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @GetMapping("/api/greet")
    public String greet() {
        return "Hello from MyRestController!";
    }
}
