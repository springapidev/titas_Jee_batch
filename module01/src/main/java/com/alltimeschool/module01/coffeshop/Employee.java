package com.alltimeschool.module01.coffeshop;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component
public class Employee {
    @PostConstruct
    public void startShift() {
        System.out.println("Employee is ready for the shift.");
    }

    @PreDestroy
    public void endShift() {
        System.out.println("Employee's shift is over.");
    }
}
