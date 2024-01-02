package com.example.lesson46bl.repository;

import com.example.lesson46bl.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface CarRepository extends JpaRepository<CarEntity, Integer> {

}
