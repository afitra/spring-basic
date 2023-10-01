package com.example.demo_satu.client;

import lombok.Data;


/*
    asumsikan class ini tidak bisa di edit / menambahkan apapun
    asumsi class ini milik client / package orang
 */
@Data
public class PaymentGatewayClient {
    private String endpoint;
    private String privateKey;
    private String publicKey;
}
