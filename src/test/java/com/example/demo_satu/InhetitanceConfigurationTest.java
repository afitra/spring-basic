package com.example.demo_satu;

import com.example.demo_satu.service.MerchanService;
import com.example.demo_satu.service.MerchanServiceImplement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InhetitanceConfigurationTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setup() {
        applicationContext = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void inheritanceConfigurationTest() {
        MerchanService merchanService = applicationContext.getBean(MerchanService.class);
        MerchanServiceImplement merchanServiceImplement = applicationContext.getBean(MerchanServiceImplement.class);

        Assertions.assertSame(merchanService, merchanServiceImplement);
    }

}
