package com.example.spring.javaConfig.service;

import com.example.spring.javaConfig.model.Customer;
import com.example.spring.javaConfig.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    //autowired at member variable level
    @Autowired
    private CustomerRepository customerRepository;


    public CustomerServiceImpl(){}

    public CustomerServiceImpl(CustomerRepository customerRepository){
        System.out.println("Using constructor injection");
        this.customerRepository = customerRepository;
    }

    //autowired to setter method
    //@Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("Using setter injection");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}
