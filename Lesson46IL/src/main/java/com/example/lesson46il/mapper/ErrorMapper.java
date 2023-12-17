package com.example.lesson46il.mapper;

import com.example.lesson46il.dto.IlError;
import com.example.lesson46il.exc.CarFailedException;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ErrorMapper {

@Mapping(target= "message", source = "message")
@Mapping(target= "service", source = "service")
@Mapping(target= "action", constant = "find car")
IlError toil(CarFailedException exc);

}
