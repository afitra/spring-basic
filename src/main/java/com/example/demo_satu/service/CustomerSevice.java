package com.example.demo_satu.service;

import com.example.demo_satu.repository.CustomerRepository;
import com.example.demo_satu.repository.UserRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerSevice {

    @Getter
    @Autowired
    private CustomerRepository customerRepository;


    @Getter
    @Autowired
    @Qualifier("normalUserRepository")
    private UserRepository normalUserRepository;

    @Getter
    @Autowired
    @Qualifier("premiumUserRepository")
    private UserRepository premiumUserRepository;


}
