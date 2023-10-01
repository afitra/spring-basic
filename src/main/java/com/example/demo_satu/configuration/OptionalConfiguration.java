package com.example.demo_satu.configuration;

import com.example.demo_satu.data.Dam;
import com.example.demo_satu.data.Foo;
import com.example.demo_satu.data.FooDam;
import com.example.demo_satu.data.MultiFoo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.Optional;

@Configuration
@Import(MultiFoo.class)
public class OptionalConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public FooDam fooDam(Optional<Foo> foo, Optional<Dam> dam) {
        return new FooDam(foo.orElse(null), dam.orElse(null));

    }


}
