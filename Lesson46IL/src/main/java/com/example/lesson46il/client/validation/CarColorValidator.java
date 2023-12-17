package com.example.lesson46il.client.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

public class CarColorValidator implements ConstraintValidator<CheckCarColorValidation, String> {

    private final BlackList blackList;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isBlank()){
            return false;
        }

        for (int i = 0; i < 5; i++) {
            if (value.equals(blackList.getBlacklist().get(i))){
                return false;
            }
        }
        return true;
    }
}
