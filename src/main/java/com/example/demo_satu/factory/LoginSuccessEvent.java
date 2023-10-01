package com.example.demo_satu.factory;

import com.example.demo_satu.data.User;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class LoginSuccessEvent extends ApplicationEvent {

    @Getter
    private final User user;
    /*
        final di gunakan untuk nilai yang tidak bisa di ubah
     */

    public LoginSuccessEvent(User source) {
        super(source);

        this.user = source;
    }
}
