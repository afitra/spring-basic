package com.example.demo_satu;

import com.example.demo_satu.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryBeanTest {

    @Test
    void testPrimary() {
        ApplicationContext context = new AnnotationConfigApplicationContext(PrimaryBean.class);

        Foo result = context.getBean(Foo.class);

        Assertions.assertNotNull(context);

    }

    @Test
    void getBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(PrimaryBean.class);
        Foo result = context.getBean(Foo.class);
        Foo bean1 = context.getBean("foo1", Foo.class);
        Foo bean2 = context.getBean("foo2", Foo.class);
        Assertions.assertNotSame(bean1, bean2);
        Assertions.assertSame(result, bean2);
    }
}
