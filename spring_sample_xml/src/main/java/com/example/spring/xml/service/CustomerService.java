package com.example.spring.xml.service;

import com.example.spring.xml.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
