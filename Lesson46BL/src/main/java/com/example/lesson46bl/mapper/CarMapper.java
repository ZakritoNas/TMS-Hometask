package com.example.lesson46bl.mapper;

import com.example.lesson46bl.dto.CarDto;
import com.example.lesson46bl.entity.CarEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {
    CarEntity toEntity (CarDto dto);

    CarDto toDto (CarEntity entity);

    List<CarDto> toDtos(List<CarEntity> all);
}
