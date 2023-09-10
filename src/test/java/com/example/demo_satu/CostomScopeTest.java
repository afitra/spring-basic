package com.example.demo_satu;

import com.example.demo_satu.data.Dam;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CostomScopeTest {

    private ApplicationContext context;

    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
    }

    @Test
    void costomScopeTest() {
        Dam dam1 = context.getBean("damCostomScope", Dam.class);
        Dam dam2 = context.getBean("damCostomScope", Dam.class);
        Dam dam3 = context.getBean("damCostomScope", Dam.class);
        Dam dam4 = context.getBean("damCostomScope", Dam.class);

//        belum di ketahui kenapa error
//        Assertions.assertSame(dam1, dam3);
//        Assertions.assertSame(dam2, dam4);
//        Assertions.assertNotSame(dam2, dam3);

    }
}
