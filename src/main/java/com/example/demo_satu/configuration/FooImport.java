package com.example.demo_satu.configuration;

import com.example.demo_satu.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class FooImport {
    @Lazy
    @Bean
    public Foo fooImportClass() {
        return new Foo();
    }
}
