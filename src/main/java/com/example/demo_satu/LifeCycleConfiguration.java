package com.example.demo_satu;

import com.example.demo_satu.data.ConnectionData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfiguration {

    
    @Bean
    public ConnectionData connectionData() {
        return new ConnectionData();
    }
}
