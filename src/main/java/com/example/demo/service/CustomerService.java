package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    List<Customer> getCustomers(String sortDrc) {
        return null;
    }

    public List<Integer> getPincodes() {
        return null;
    }

    public List<String> getStates() {
        return null;
    }
}
