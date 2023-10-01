package com.example.demo_satu;

import com.example.demo_satu.configuration.OptionalConfiguration;
import com.example.demo_satu.data.Foo;
import com.example.demo_satu.data.FooDam;
import com.example.demo_satu.data.MultiFoo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class OptionalConfigurationTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setup() {
        applicationContext = new AnnotationConfigApplicationContext(OptionalConfiguration.class);
        applicationContext.registerShutdownHook();
    }


    @Test
    void optionalConfigurationTest() {
        Foo foo = applicationContext.getBean(Foo.class);
        FooDam fooDam = applicationContext.getBean(FooDam.class);

        Assertions.assertNull(fooDam.getDam());
        Assertions.assertSame(foo, fooDam.getFoo());
    }

    @Test
    void objectProviderTest() {
        MultiFoo multiFoo = applicationContext.getBean(MultiFoo.class);
        Assertions.assertEquals(1, multiFoo.getFoos().size());
        Assertions.assertNotEquals(3, multiFoo.getFoos().size());
    }
}
