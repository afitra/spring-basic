package com.example.demo_satu;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.example.demo_satu.service",
        "com.example.demo_satu.repository",
        "com.example.demo_satu.configuration",
})

public class ComponentConfiguration {
}
