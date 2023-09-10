package com.example.demo_satu;

import com.example.demo_satu.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DuplicateBean {

    @Bean
    public Foo foo1() {
        Foo result = new Foo();
        return result;
    }

    @Bean
    public Foo foo2() {
        Foo result = new Foo();
        return result;
    }

}
