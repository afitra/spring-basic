package com.example.demo_satu;

import com.example.demo_satu.data.ServerConnection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServerConnectionTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void serverConnectionTest() {
        ServerConnection server = context.getBean("serverConnection", ServerConnection.class);
    }

}
