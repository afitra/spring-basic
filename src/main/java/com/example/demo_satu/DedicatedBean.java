package com.example.demo_satu;

import com.example.demo_satu.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DedicatedBean {
    @Primary
    @Bean(name = "firstBean")
    public Foo foo1() {
        return new Foo();
    }

    @Bean(name = "secondBean")
    public Foo foo2() {
        return new Foo();
    }
}
