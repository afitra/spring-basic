package com.example.demo_satu;

import com.example.demo_satu.data.ConnectionData;
import com.example.demo_satu.data.ServerConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class LifeCycleConfiguration {


    @Bean
    @Lazy
    public ConnectionData connectionData() {
        return new ConnectionData();
    }


    /*

        life cycle dalam bean tanpa implementasi InitializingBean, DisposableBean  walaupun di gabung juga bisa
        initMethod   di gunakan  untuk menjalakan method saat bean ini selesai di buat
        destroyMethod di gunakan untuk menjalankan method saat server di matikan

     */

    //    @Bean(initMethod = "startServer", destroyMethod = "stopServer")
    @Bean
    public ServerConnection serverConnection() {
        return new ServerConnection();
    }
}
