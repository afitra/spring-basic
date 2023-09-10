package com.example.demo_satu;

import com.example.demo_satu.data.Dam;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class DamImport {
    @Lazy
    @Bean
    public Dam damImport() {
        return new Dam();
    }
}
