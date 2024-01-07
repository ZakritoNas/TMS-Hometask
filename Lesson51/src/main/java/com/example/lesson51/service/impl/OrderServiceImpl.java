package com.example.lesson51.service.impl;

import com.example.lesson51.domain.Order;
import com.example.lesson51.domain.Product;
import com.example.lesson51.service.DataService;
import com.example.lesson51.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor

@Service
public class OrderServiceImpl implements OrderService {

    private final DataService service;

    @Override
    public Order save (Product product, Integer quantity) {
        Order order = Order.builder()
                .id (1)
                .product(product)
                .quantity(quantity)
                .count(240000L)
                .build();
        return service.save(order);
    }
}
