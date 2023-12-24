package com.example.lesson45il.service.impl;

import com.example.lesson45il.client.CarClient;
import com.example.lesson45il.dto.CarDto;
import com.example.lesson45il.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor

@Service
public class StoreServiceImpl implements CarService {

    private final CarClient client;

    @Override
    public CarDto save(CarDto dto) {
        return client.save(dto);
    }

    @Override
    public CarDto find(Integer id) {
            return client.find(id);
    }

    @Override
    public List<CarDto> findAll() {
        return client.findAll();
    }
}
