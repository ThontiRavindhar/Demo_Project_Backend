package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/getCustomers")
    List getCustomers(@RequestParam( value = "sort", defaultValue = "ASC") String sortDrc) {
        return null;
    }

    @GetMapping("/getCustomer/{id}")
    Customer getCustomer(@PathVariable final String id) {
        return null;
    }

    @PostMapping("/createCustomer")
    String createCustomer(@Valid @RequestBody Customer customer) {
        return null;
    }

}
