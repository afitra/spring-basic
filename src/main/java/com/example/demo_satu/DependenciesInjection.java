package com.example.demo_satu;

import com.example.demo_satu.data.Dam;
import com.example.demo_satu.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependenciesInjection {

    @Bean
    public Foo foo_lima() {
        return new Foo();
    }

    @Bean
    public Dam dam_enam() {
        return new Dam();
    }


//    @Bean
//    public FooDam fooDamSatu(@Qualifier("foo") Foo foo, Dam dam_enam) {
//        return new FooDam(foo, dam_enam);
//    }
}
