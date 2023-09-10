package com.example.demo_satu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependConfigurationTest {

    private ApplicationContext context;

    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext(DuplicateBean.class);
    }


    @Test
    void testDepend() {
        //
    }
}
