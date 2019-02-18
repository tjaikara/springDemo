package com.example.spring.xml_anno.repository;

import com.example.spring.xml_anno.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
