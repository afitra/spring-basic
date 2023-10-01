package com.example.demo_satu.factory;

import com.example.demo_satu.client.PaymentGatewayClient;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component("paymentGatewayCLient")
public class PaymentGatewayClientFactoryBean implements FactoryBean<PaymentGatewayClient> {

    @Override
    public PaymentGatewayClient getObject() throws Exception {
        PaymentGatewayClient client = new PaymentGatewayClient();
        client.setEndpoint("https://apitoong.com");
        client.setPrivateKey("private");
        client.setPublicKey("public");

        return client;
    }

    @Override
    public Class<?> getObjectType() {
        return PaymentGatewayClient.class;
    }
}
