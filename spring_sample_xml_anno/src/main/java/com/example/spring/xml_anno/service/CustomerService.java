package com.example.spring.xml_anno.service;

import com.example.spring.xml_anno.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
