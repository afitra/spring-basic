package com.example.demo_satu;

import com.example.demo_satu.data.Dam;
import com.example.demo_satu.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScanConfigurationTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext(ScanConfiguration.class);
    }

    @Test
    void scanConfogurationTest() {
        Foo foo = context.getBean("fooImportClass", Foo.class);
        Dam dam = context.getBean("damImportClass", Dam.class);
    }
}
