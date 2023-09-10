package com.example.demo_satu;

import com.example.demo_satu.data.ConnectionData;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
    gunakan class ConfigurableApplicationContext unutk dapat akses methos close()
    untuk menghentikan app

    selain menggunakan .close() bisa juga menggunakan methos .registerShutdownHook()
 */

public class LifeCycleTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);

    }

    @AfterEach
    void matikanServer() {
//        context.close();
        context.registerShutdownHook();
    }

    @Test
    void lifeCycleConfigurationTest() {
        ConnectionData connection = context.getBean("connectionData", ConnectionData.class);
    }


}
