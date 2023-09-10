package com.example.demo_satu;

import com.example.demo_satu.data.Dam;
import com.example.demo_satu.data.Foo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class DependConfiguration {

    private static final Logger log = LoggerFactory.getLogger(Foo.class);

    @Bean
    @DependsOn({
            "damtes"
    })
    public Foo footes() {
        log.info("create foo >>>> 1");
        return new Foo();
    }

    @Bean
    public Dam damtes() {
        log.info("create dam >>>> 2");
        return new Dam();
    }
}
