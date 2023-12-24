package com.example.lesson45il.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class IlError {
    private String service;
    private String message;
    private String action;
}
