package com.example.demo_satu;

import com.example.demo_satu.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DedicatedBeanTest {

    private ApplicationContext context;

    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext(DedicatedBean.class);
    }


    @Test
    void testDedicatedBean() {
        Foo foo = context.getBean(Foo.class);
        Foo foo1 = context.getBean("firstBean", Foo.class);
        Foo foo2 = context.getBean("secondBean", Foo.class);

        Assertions.assertSame(foo, foo1);
        Assertions.assertNotSame(foo1, foo2);

    }

}
