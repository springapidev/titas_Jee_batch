package com.alltimeschool.module01.beanlifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifecycleBean {
    @PostConstruct
    public void init() {
        System.out.println("Bean is initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean is destroyed");
    }
}
