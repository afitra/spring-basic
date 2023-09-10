package com.example.demo_satu;

import com.example.demo_satu.data.Dam;
import com.example.demo_satu.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeConfigurationTest {

    private ApplicationContext context;

    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
    }

    @Test
    void ScopeConfigurationTest() {
        Foo foo1 = context.getBean("fooScope", Foo.class);
        Foo foo2 = context.getBean("fooScope", Foo.class);
        Foo foo3 = context.getBean("fooScope", Foo.class);

        Assertions.assertNotSame(foo1, foo2);
        Assertions.assertNotSame(foo1, foo3);
        Assertions.assertNotSame(foo2, foo3);


        Dam dam1 = context.getBean("damScope", Dam.class);
        Dam dam2 = context.getBean("damScope", Dam.class);
        Dam dam3 = context.getBean("damScope", Dam.class);

        Assertions.assertSame(dam1, dam2);
        Assertions.assertSame(dam1, dam3);
        Assertions.assertSame(dam2, dam3);
    }


}
