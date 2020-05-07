package com.example.demo.validator;

import com.example.demo.annotation.State;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class StateValidator implements ConstraintValidator<State, String> {

    @Autowired
    CustomerService customerService;

    @Override
    public boolean isValid(String state, ConstraintValidatorContext context) {
        List<String> states = customerService.getStates();
        if(!states.contains(state)) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Invalid State");
        }
        return true;
    }

}
