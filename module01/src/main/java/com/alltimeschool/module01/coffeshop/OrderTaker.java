package com.alltimeschool.module01.coffeshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
public class OrderTaker {
    @GetMapping("/order")
    public String takeOrder(Model model) {
        model.addAttribute("message", "Order received!");
        return "orderPage";
    }
}
