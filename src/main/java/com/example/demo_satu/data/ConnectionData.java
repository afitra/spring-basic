package com.example.demo_satu.data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Slf4j
public class ConnectionData implements InitializingBean, DisposableBean {


    /*
        afterPropertiesSet method bawaan dari InitializingBean
        destroy method bawaan dari DisposableBean
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("Connection is ready to be used");
    }

    @Override
    public void destroy() throws Exception {
        log.info("Connection is closed");
    }

}
