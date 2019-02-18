package com.example.spring.javaConfig.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.example.spring.javaConfig.repository.CustomerRepository;
import com.example.spring.javaConfig.repository.HibernateCustomerRepositoryImpl;
import com.example.spring.javaConfig.service.CustomerService;
import com.example.spring.javaConfig.service.CustomerServiceImpl;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("com.example.spring.javaConfig")
@PropertySource("app.properties")
public class AppConfig {

    @Bean(name = "customerService")
    public CustomerService getCustomerService(){

//        //setter injection
//        CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl(getCustomerRepository());
//        customerServiceImpl.setCustomerRepository(getCustomerRepository());
//        return customerServiceImpl;
//
//        //constructor injection
//        return  new CustomerServiceImpl(getCustomerRepository());

        //Autowired repository
        return new CustomerServiceImpl();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

//    @Bean(name = "customerRepository")
//    public CustomerRepository getCustomerRepository(){
//        return new HibernateCustomerRepositoryImpl();
//    }

}
