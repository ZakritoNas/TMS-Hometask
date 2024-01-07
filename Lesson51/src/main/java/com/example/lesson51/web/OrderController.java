package com.example.lesson51.web;

import com.example.lesson51.domain.Order;
import com.example.lesson51.domain.Product;
import com.example.lesson51.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService service;

    @PostMapping
    public Order save (Product product, Integer quantity){
        Order save = service.save(product, quantity);
        return save;
    }
}
