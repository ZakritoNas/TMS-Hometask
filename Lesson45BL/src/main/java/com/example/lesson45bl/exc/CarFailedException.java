package com.example.lesson45bl.exc;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CarFailedException extends RuntimeException {

    private String errorMessage;

    public CarFailedException (String errorMessage){
        super(errorMessage);
        this.errorMessage = errorMessage;
    }
}
