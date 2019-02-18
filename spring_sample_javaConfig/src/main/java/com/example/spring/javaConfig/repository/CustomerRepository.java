package com.example.spring.javaConfig.repository;

import com.example.spring.javaConfig.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
