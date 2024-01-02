package com.example.lesson46bl.web;

import com.example.lesson46bl.dto.CarDto;
import com.example.lesson46bl.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService service;

    @PostMapping
    public CarDto save(@RequestBody CarDto request){
        return service.save(request);
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
