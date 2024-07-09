package com.example.hotelbookingapp.validation.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.example.hotelbookingapp.validation.validator.CardExpiryValidator;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CardExpiryValidator.class)
public @interface CardExpiry {

    String message() default "Invalid expiration date";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
