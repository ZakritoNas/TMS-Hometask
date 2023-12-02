package com.example.lessson40.dto;


import com.example.lessson40.domain.Genres;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FilmCreateDto {
    private String name;
    private Genres genre;
    private Date dateOfIssue;
    private Integer rating;
}
