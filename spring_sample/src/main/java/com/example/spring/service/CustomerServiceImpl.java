package com.example.spring.service;

import com.example.spring.model.Customer;
import com.example.spring.repository.CustomerRepository;
import com.example.spring.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}
