package com.alltimeschool.module01.coffeshopwithlog;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;
@Service
public class CoffeeMakerLog {

    @PostConstruct
    public void init() {
        System.out.println("CoffeeMaker initialized.");
    }

    public String brewCoffee() {
        System.out.println("Brewing coffee.");
        return "Brewing a delicious cup of coffee!";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("CoffeeMaker is being destroyed.");
    }
}
