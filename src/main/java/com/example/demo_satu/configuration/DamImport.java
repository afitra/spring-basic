package com.example.demo_satu.configuration;

import com.example.demo_satu.data.Dam;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DamImport {
    //    @Lazy
    @Bean
    public Dam damImportClass() {
        return new Dam();
    }

}
