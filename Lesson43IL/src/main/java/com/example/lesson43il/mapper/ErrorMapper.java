package com.example.lesson43il.mapper;

import com.example.lesson43il.dto.IlError;
import com.example.lesson43il.exc.CarFailedException;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ErrorMapper {

@Mapping(target= "message", source = "message")
@Mapping(target= "service", source = "service")
@Mapping(target= "action", source = "find car")
IlError toil(CarFailedException exc);

}
