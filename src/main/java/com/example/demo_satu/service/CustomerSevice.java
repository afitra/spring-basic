package com.example.demo_satu.service;

import com.example.demo_satu.repository.CustomerRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerSevice {

    @Getter
    @Autowired
    private CustomerRepository customerRepository;


}
