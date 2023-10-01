package com.example.demo_satu;

import com.example.demo_satu.listener.LoginSuccessListener;
import com.example.demo_satu.listener.RepeatLoginSuccessListener;
import com.example.demo_satu.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {

    @Configuration
    @Import({
            UserService.class,
            LoginSuccessListener.class,
            RepeatLoginSuccessListener.class
    })

    public static class TestConfiguration {

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }


    @Test
    void eventTest() {
        UserService userService = applicationContext.getBean(UserService.class);

        userService.login("fulan", "fulan");
        userService.login("budi", "budi");
        userService.login("angga", "angga");
        userService.login("teji", "teji");

    }

}
