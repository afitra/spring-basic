package com.example.demo_satu;

import com.example.demo_satu.data.Dam;
import com.example.demo_satu.data.Foo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;


//@Slf4j
@Configuration
public class LazyConfiguration {

    /*
    lazy digunakan jika bean tidak ingin di eksekusi saat applikasi pertama kali di buat,
    artinya bean tersebut akan dibuat ketika di butuhkan

    damLazy di panggil maka fooLazy tidak di eksekusi
    jika fooLazy di panggil damLazy n fooLazy di eksekusi karena  fooLazy depens ke damLazy
     */

    private static final Logger log = LoggerFactory.getLogger(LazyConfiguration.class);

    @Lazy
    @Bean
    @DependsOn({
            "damLazy"
    })
    public Foo fooLazy() {
        log.info("create foo >>>> lazy");
        return new Foo();
    }

    @Bean
    public Dam damLazy() {
        log.info("create dam >>>> lazy");
        return new Dam();
    }
}
