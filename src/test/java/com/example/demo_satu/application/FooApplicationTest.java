package com.example.demo_satu.application;

import com.example.demo_satu.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = FooApplication.class)
class FooApplicationTest {

    /*
        jika menggunakan @SpringBootTest
        dan ditambah @AUtowired makan bean auto di import
        tidak perlu manual
            applicationContext.getBean(UserService.class);
     */
    @Autowired
    Foo foo;

    @Test
    void springbootTest() {
        Assertions.assertNotNull(foo);
    }
}