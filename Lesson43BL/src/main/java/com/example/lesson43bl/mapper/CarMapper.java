package com.example.lesson43bl.mapper;

import com.example.lesson43bl.dto.CarDto;
import com.example.lesson43bl.entity.CarEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {
    CarEntity toEntity (CarDto dto);

    CarDto toDto (CarEntity entity);

    List<CarDto> toDtos(List<CarEntity> all);
}
