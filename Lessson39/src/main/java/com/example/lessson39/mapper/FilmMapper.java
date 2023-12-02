package com.example.lessson39.mapper;


import com.example.lessson39.domain.FilmEntity;
import com.example.lessson39.dto.FilmCreateDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper(
        componentModel = "spring"
)
public interface FilmMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "name", source = "name")
    @Mapping(target = "genre", source = "genre")
    @Mapping(target = "dateOfIssue", source = "dateOfIssue")
    @Mapping(target = "rating", source = "rating")
    FilmEntity toEntity(FilmCreateDto filmDto);
}
