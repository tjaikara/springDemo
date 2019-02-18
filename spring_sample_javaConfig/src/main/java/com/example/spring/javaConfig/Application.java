package com.example.spring.javaConfig;

import com.example.spring.javaConfig.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.spring.javaConfig.service.CustomerService;

public class Application {

    public static void main(String[] args){

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class)
                ;
        //CustomerService com.example.spring.javaConfig.service = new CustomerServiceImpl();

        CustomerService service = appContext.getBean("customerService", CustomerService.class);

        System.out.println(service.findAll().get(0).getFirstName());
    }
}


