package com.example.demo.annotation;

import com.example.demo.validator.StateValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention( RetentionPolicy.RUNTIME )
@Constraint(validatedBy = StateValidator.class )
public @interface State {

    String message() default "State is invalid";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
