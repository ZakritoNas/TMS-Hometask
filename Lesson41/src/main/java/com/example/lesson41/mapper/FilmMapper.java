package com.example.lesson41.mapper;

import com.example.lesson41.domain.FilmEntity;
import com.example.lesson41.dto.FilmCreateDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

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

    @Mapping(target = "name", source = "name")
    @Mapping(target = "genre", source = "genre")
    @Mapping(target = "dateOfIssue", source = "dateOfIssue")
    @Mapping(target = "rating", source = "rating")
    FilmCreateDto toDto(FilmEntity filmEntity);

    List<FilmCreateDto> toDto (List<FilmEntity> entityList);
}
