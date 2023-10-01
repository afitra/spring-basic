package com.example.demo_satu;

import com.example.demo_satu.data.Car;
import com.example.demo_satu.processor.IdGeneratorBeanPostProcessor;
import com.example.demo_satu.processor.PrefixIdGeneratorBeanPostProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class OrderedTest {

    @Configuration
    @Import({
            Car.class,
            PrefixIdGeneratorBeanPostProcessor.class,
            IdGeneratorBeanPostProcessor.class
    })

    public static class TestConfiguration {

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setup() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void carTest2() {
        Car car = applicationContext.getBean(Car.class);

        Assertions.assertNotNull(car.getId());
        Assertions.assertTrue(car.getId().startsWith("PRE-"));
    }
}
