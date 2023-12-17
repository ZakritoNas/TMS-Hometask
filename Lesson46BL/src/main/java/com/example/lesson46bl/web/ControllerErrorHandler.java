package com.example.lesson46bl.web;

import com.example.lesson46bl.exc.CarFailedException;
import com.example.lesson46bl.exc.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerErrorHandler {

    @ExceptionHandler(CarFailedException.class)
    public ResponseEntity<ErrorDetails> handler (CarFailedException exc){

        String errorMessage = exc.getErrorMessage();

        ErrorDetails errorDetails = ErrorDetails.builder()
                .service("car-client")
                .message(errorMessage)
                .code(400)
                .build();

        return ResponseEntity.status(400)
                .body(errorDetails);
    }
}
