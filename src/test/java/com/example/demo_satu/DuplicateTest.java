package com.example.demo_satu;

import com.example.demo_satu.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicateTest {

    @Test
    void testDuplicate() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBean.class);
        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            Foo test = context.getBean(Foo.class);
        });
    }

    void getBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBean.class);
        Foo result1 = context.getBean("foo1", Foo.class);
        Foo result2 = context.getBean("foo2", Foo.class);
        Assertions.assertNotSame(result1, result2);
    }
}
