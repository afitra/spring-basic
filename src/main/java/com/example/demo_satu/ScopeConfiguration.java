package com.example.demo_satu;

import com.example.demo_satu.data.Dam;
import com.example.demo_satu.data.Foo;
import com.example.demo_satu.scope.CostomScope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class ScopeConfiguration {

    /*
        Secara default bean di eksekusi secara sigleton, namaun jika di tambah kan scope bisa di konfigurasi lanjut
        sigleton    -> (default) di eksekusi sekali saat build, kecuali saat mode lazy
        prototype   -> di buat baru setiap kali diakses
        request     -> di buat baru per Http request (web app)
        session     -> di buat baru per Http session (web app)
        application -> di buat baru per servletContext (web app)
        websocket   -> di buat baru per websocket request (web app)
     */

    @Bean
    @Scope("prototype")
    public Foo fooScope() {
        log.info("Create Scope fooo");
        return new Foo();
    }

    @Bean
    @Scope("singleton")
    public Dam damScope() {
        log.info("Create Scope damm");
        return new Dam();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("tesScope", new CostomScope());
        return configurer;
    }

    @Bean
    @Scope("tesScope")
    public Dam damCostomScope() {
        log.info("create dam costom scope xxx>>> ");
        return new Dam();
    }

}
