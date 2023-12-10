package com.example.lesson43il.service;

import com.example.lesson43il.dto.CarDto;

import java.util.List;

public interface CarService {
    CarDto save (CarDto dto);
    CarDto find (Integer id);
    List<CarDto> findAll();
}
