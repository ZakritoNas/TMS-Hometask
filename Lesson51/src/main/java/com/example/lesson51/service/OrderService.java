package com.example.lesson51.service;

import com.example.lesson51.domain.Order;
import com.example.lesson51.domain.Product;

public interface OrderService {
    Order save(Product product, Integer quantity);
}
