package com.example.lesson46il.client.validation;

import com.example.lesson46il.service.impl.StoreServiceImpl;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

public class CarColorValidator implements ConstraintValidator<CheckCarColorValidation, String> {

    private final StoreServiceImpl service;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isBlank()){
            return false;
        }

        if (service.blackList().contains(value)){
            return false;
        }

        return true;
    }
}
