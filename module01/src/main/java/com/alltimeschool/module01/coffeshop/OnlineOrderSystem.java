package com.alltimeschool.module01.coffeshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class OnlineOrderSystem {
    @GetMapping("/api/order")
    public String placeOrder() {
        return "Order placed successfully!";
    }
}
