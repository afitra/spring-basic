package com.example.demo_satu;

import com.example.demo_satu.data.Car;
import com.example.demo_satu.processor.IdGeneratorBeanPostProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class BeanPostProcessorTest {
    @Configuration
    @Import({
            Car.class,
            IdGeneratorBeanPostProcessor.class
    })

    public static class ConfigurationTest {
    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setup() {
        applicationContext = new AnnotationConfigApplicationContext(ConfigurationTest.class);
        applicationContext.registerShutdownHook();
    }


    @Test
    void carTest() {
        Car car = applicationContext.getBean(Car.class);
        System.out.println(car.getId());
        Assertions.assertNotNull(car.getId());

    }
}
