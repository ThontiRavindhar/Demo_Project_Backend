package com.example.demo.validator;

import com.example.demo.annotation.Pincode;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class PincodeValidator implements ConstraintValidator<Pincode, Integer> {

    @Autowired
    CustomerService customerService;

    List<Integer> pincodes = customerService.getPincodes();

    @Override
    public boolean isValid(Integer pincode, ConstraintValidatorContext context) {
        if (!pincodes.contains(pincode)) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Invalid Pincode");
            return false;
        }
        return true;
    }
}
