package com.example.demo_satu;

import com.example.demo_satu.service.MerchanServiceImplement;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MerchanServiceImplement.class)
public class InheritanceConfiguration {
}
