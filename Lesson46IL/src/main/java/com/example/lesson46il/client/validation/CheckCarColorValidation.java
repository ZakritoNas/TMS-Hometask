package com.example.lesson46il.client.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CarColorValidator.class)
public @interface CheckCarColorValidation {

    String message() default "The entered name is in black list";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
