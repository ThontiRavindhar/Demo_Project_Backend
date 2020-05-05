package com.example.demo.annotation;


import com.example.demo.validator.PincodeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = PincodeValidator.class)
public @interface Pincode {

    String message() default "Pincode is not valid";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
