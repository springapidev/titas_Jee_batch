package com.alltimeschool.module01.coffeshopwithlog;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BaristaLog {

    @PostConstruct
    public void init() {
        System.out.println("Barista initialized.");
    }

    public String prepareCoffee() {
        System.out.println("Barista is preparing coffee.");
        return "Coffee is ready!";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Barista is being destroyed.");
    }
}
