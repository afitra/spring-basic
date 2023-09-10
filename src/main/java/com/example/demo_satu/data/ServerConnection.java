package com.example.demo_satu.data;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class ServerConnection {

    /*
          @Bean(initMethod = "startServer", destroyMethod = "stopServer")
          atau
          @Bean
          cara lain pengganti initMethod n destroyMethod  bisa menggunakan @PostConstruct n @PreDestroy
     */

    @PostConstruct
    public void startServer() {
        log.info("server berhasil di nyalakan");
    }

    @PreDestroy
    public void stopServer() {
        log.info("server berhasil di matikan");
    }
}
