package com.example.spring.javaConfig.service;

import com.example.spring.javaConfig.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
