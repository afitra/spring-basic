package com.example.demo_satu;

import com.example.demo_satu.data.Dam;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LazyConfigurationTest {

    private ApplicationContext context;

    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext(LazyConfiguration.class);
    }

    @Test
    void tesLazy() {
        Dam dam = context.getBean("damLazy", Dam.class);
//        Foo foo = context.getBean("fooLazy", Foo.class);
    }
}
