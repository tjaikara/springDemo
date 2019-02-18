package com.example.spring.repository;

import com.example.spring.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll(){
        List<Customer> customerList = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Tony");
        customer.setLastName("Aikara");

        customerList.add(customer);

        return customerList;
    }
}
