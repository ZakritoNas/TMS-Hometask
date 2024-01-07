package com.example.lesson51.service;

import com.example.lesson51.domain.Order;
import org.springframework.stereotype.Service;

@Service
public class DataService {
    public Order save (Order order){
        throw new RuntimeException();
    }
}
