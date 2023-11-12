package com.example.lessson40.mapper;


import com.example.lessson40.domain.FilmEntity;
import com.example.lessson40.dto.FilmCreateDto;
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
