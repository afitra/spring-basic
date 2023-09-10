package com.example.demo_satu;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooImport.class,
        DamImport.class
})
public class MainImport {

    
}
