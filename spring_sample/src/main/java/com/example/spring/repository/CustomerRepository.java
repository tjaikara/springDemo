package com.example.spring.repository;

import com.example.spring.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
