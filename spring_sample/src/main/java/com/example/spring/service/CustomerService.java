package com.example.spring.service;

import com.example.spring.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
