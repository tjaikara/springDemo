package com.example.spring.xml_anno.repository;

import com.example.spring.xml_anno.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
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
