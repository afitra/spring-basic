package com.example.demo_satu.listener;

import com.example.demo_satu.factory.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class RepeatLoginSuccessListener implements ApplicationListener<LoginSuccessEvent> {


    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        log.info("Success login for user {} ", event.getUser());
    }
}