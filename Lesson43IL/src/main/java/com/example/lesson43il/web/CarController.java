package com.example.lesson43il.web;

import com.example.lesson43il.dto.CarDto;
import com.example.lesson43il.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor

@RestController
@RequestMapping("/store/cars")
public class CarController {

    private final CarService service;

    @PostMapping
    public CarDto save(@RequestBody CarDto dto){
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
