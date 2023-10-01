package com.example.demo_satu;

import com.example.demo_satu.client.PaymentGatewayClient;
import com.example.demo_satu.configuration.FactoryConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryConfigurationTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setup() {
        applicationContext = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
        applicationContext.registerShutdownHook();
    }


    @Test
    void factoryConfigutarionTest() {
        PaymentGatewayClient paymentGatewayClient = applicationContext.getBean(PaymentGatewayClient.class);

        Assertions.assertNotNull(paymentGatewayClient);
        Assertions.assertEquals("https://apitoong.com", paymentGatewayClient.getEndpoint());
        Assertions.assertEquals("private", paymentGatewayClient.getPrivateKey());
        Assertions.assertEquals("public", paymentGatewayClient.getPublicKey());

    }
}
