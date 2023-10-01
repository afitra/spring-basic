package com.example.demo_satu;

import com.example.demo_satu.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "com.example.demo_satu.service",
        "com.example.demo_satu.repository",
        "com.example.demo_satu.configuration",
})


@Import(MultiFoo.class)
public class ComponentConfiguration {
}
