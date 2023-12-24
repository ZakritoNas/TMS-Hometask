package com.example.lesson45bl.service.impl;

import com.example.lesson45bl.dto.CarDto;
import com.example.lesson45bl.exc.CarFailedException;
import com.example.lesson45bl.mapper.CarMapper;
import com.example.lesson45bl.repository.CarRepository;
import com.example.lesson45bl.service.CarService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor

@Service
@Transactional
public class CarServiceImpl implements CarService {

    private final CarMapper mapper;
    private final CarRepository repository;

    @Override
    public CarDto save(CarDto dto) {
        return mapper.toDto(
                repository.save(
                        mapper.toEntity(dto)
                ));
    }

    @Override
    public CarDto find(Integer id) {
       var car = repository.findById(id)
                .orElseThrow(() -> new CarFailedException("Car not found"));
       return mapper.toDto(car);
    }

    @Override
    public List<CarDto> findAll() {
        return mapper.toDtos(
                repository.findAll());
    }
}
