package com.example.demo_satu;

import com.example.demo_satu.service.AuthService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class AwareTest {

    @Configuration
    @Import({
            AuthService.class
    })

    public static class TestConfiguration {

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }


    @Test
    void awareTest() {
        AuthService authService = applicationContext.getBean(AuthService.class);
//        System.out.println(authService.getBeanName());
        Assertions.assertEquals("com.example.demo_satu.service.AuthService", authService.getBeanName());

        Assertions.assertSame(applicationContext, authService.getApplicationContext());
    }
}
