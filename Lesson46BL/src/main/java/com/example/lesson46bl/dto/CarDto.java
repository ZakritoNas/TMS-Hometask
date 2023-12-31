package com.example.lesson46bl.dto;

import com.example.lesson46bl.enums.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarDto {
    private Integer id;
    private Model model;
    private String color;
}
