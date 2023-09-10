package com.example.demo_satu;

import com.example.demo_satu.data.Dam;
import com.example.demo_satu.data.Foo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    private static final Logger log = LoggerFactory.getLogger(Foo.class);

    @Bean
    public Foo foo() {
        Foo result = new Foo();
        log.info("buat bean Foo >>>>>");
        return result;
    }

    /*
        ? bean bernama foo yang bertipe class Foo
        * valuenya result
     */

    @Bean
    public Dam dam() {
        Dam result = new Dam();
        return result;
    }


}
