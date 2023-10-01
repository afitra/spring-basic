package com.example.demo_satu.configuration;

import com.example.demo_satu.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class UserConfiguration {


    @Bean
    @Primary
    public UserRepository normalUserRepository() {
        return new UserRepository();
    }

    @Bean
    public UserRepository premiumUserRepository() {
        return new UserRepository();
    }
}
