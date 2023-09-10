package com.example.demo_satu;

import com.example.demo_satu.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PrimaryBean {

    @Bean
    public Foo foo3() {
        Foo result = new Foo();
        return result;
    }

    @Primary
    @Bean
    public Foo foo4() {
        Foo result = new Foo();
        return result;
    }
}
