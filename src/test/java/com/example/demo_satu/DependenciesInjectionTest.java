package com.example.demo_satu;

import com.example.demo_satu.data.Dam;
import com.example.demo_satu.data.Foo;
import com.example.demo_satu.data.FooDam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependenciesInjectionTest {

    private ApplicationContext context;

    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext(DependenciesInjection.class);
    }

    @Test
    void testDependenciesInjection() {
        var foo = new Foo();
        var dam = new Dam();
        var fooDam = new FooDam(foo, dam);
        Assertions.assertSame(foo, fooDam.getFoo());
        Assertions.assertSame(dam, fooDam.getDam());
    }
}
