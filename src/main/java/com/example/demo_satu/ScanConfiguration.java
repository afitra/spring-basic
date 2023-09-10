package com.example.demo_satu;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/*
    digunakan untuk import rame 2, artinya
    "com.example.demo_satu.configuration" -> akan import semua class dalam folder configuration
        yang ber anotasi @Confoguration, sehinggal tak perlu import satu persatu
 */
@Configuration
@ComponentScan(basePackages = {
        "com.example.demo_satu.configuration"
})
public class ScanConfiguration {
}
