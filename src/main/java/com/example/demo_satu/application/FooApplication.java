package com.example.demo_satu.application;

import com.example.demo_satu.data.Dam;
import com.example.demo_satu.data.Foo;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FooApplication {
    @Bean
    public Foo foo(Dam dam) {
        return new Foo();
    }

//    public static void main(String[] args) {  // normal tanpa costom
//        ConfigurableApplicationContext applicationContext = SpringApplication.run(Foo.class, args);
//        Foo foo = applicationContext.getBean(Foo.class);
//        System.out.println(foo);
//    }


    public static void main(String[] args) { // untuk costo,
        SpringApplication application = new SpringApplication(FooApplication.class);
        application.setBannerMode(Banner.Mode.OFF);

        ConfigurableApplicationContext applicationContext = application.run(args);

        Foo foo = applicationContext.getBean(Foo.class);
        System.out.println(foo);
    }
}
