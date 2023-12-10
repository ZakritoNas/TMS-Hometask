package com.example.lesson43bl.service;

import com.example.lesson43bl.dto.CarDto;

import java.util.List;

public interface CarService {
    CarDto save (CarDto dto);
    CarDto find (Integer id);
    List<CarDto> findAll();
}
