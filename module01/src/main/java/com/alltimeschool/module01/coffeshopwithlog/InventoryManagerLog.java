package com.alltimeschool.module01.coffeshopwithlog;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
public class InventoryManagerLog {

    @PostConstruct
    public void init() {
        System.out.println("InventoryManager initialized.");
    }

    public String checkStock() {
        System.out.println("Checking stock.");
        return "Stock is sufficient!";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("InventoryManager is being destroyed.");
    }
}
