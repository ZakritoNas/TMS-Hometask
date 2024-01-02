package com.example.lesson46il.web;

import com.example.lesson46il.dto.CarDto;
import com.example.lesson46il.dto.IlError;
import com.example.lesson46il.service.CarService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor

@RestController
@RequestMapping("/store/cars")

public class CarController {

    private final CarService service;

    @PostMapping
    public CarDto save(@Valid @RequestBody CarDto dto){
        return service.save(dto);
    }

    @GetMapping("/{id}")
    public CarDto find(@PathVariable(name = "id") Integer id){
        return service.find(id);
    }

    @GetMapping
    public List<CarDto> findAll(){
        return service.findAll();
    }
}
