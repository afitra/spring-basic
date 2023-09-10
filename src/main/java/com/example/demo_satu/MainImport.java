package com.example.demo_satu;

import com.example.demo_satu.configuration.DamImport;
import com.example.demo_satu.configuration.FooImport;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/*

    Import digunakan untuk memanggil banyak class sehingga lebih rapi
    biasanya di gunakan untuk import berbagai config class
 */

@Configuration
@Import({
        FooImport.class,
        DamImport.class
})
public class MainImport {


}
