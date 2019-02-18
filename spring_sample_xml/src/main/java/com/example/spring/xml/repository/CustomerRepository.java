package com.example.spring.xml.repository;

import com.example.spring.xml.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
