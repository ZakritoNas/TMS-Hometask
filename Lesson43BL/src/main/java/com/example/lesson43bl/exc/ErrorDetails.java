package com.example.lesson43bl.exc;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class ErrorDetails {
    private String service;
    private String message;
    private Integer code;
}
