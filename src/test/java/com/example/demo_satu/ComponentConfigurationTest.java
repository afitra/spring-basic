package com.example.demo_satu;

import com.example.demo_satu.repository.CategoryRepository;
import com.example.demo_satu.repository.CustomerRepository;
import com.example.demo_satu.repository.ProductRepository;
import com.example.demo_satu.repository.UserRepository;
import com.example.demo_satu.service.CategoryService;
import com.example.demo_satu.service.CustomerSevice;
import com.example.demo_satu.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentConfigurationTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setup() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }


    @Test
    void testService() {
        ProductService productService1 = applicationContext.getBean(ProductService.class);
        ProductService productService2 = applicationContext.getBean("productService", ProductService.class);

        Assertions.assertSame(productService1, productService2);

    }

    @Test
    void constructorDependencyInjectionTest() {
        ProductService productService = applicationContext.getBean(ProductService.class);
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

        Assertions.assertSame(productRepository, productService.getProductRepository());
    }

    @Test
    void setterDependencyInjection() {
        CategoryService categoryService = applicationContext.getBean(CategoryService.class);
        CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);

        Assertions.assertSame(categoryService.getCategoryRepository(), categoryRepository);
    }

    @Test
    void filedDependencyInjection() {
        CustomerSevice customerSevice = applicationContext.getBean(CustomerSevice.class);
        CustomerRepository customerRepository = applicationContext.getBean(CustomerRepository.class);

        Assertions.assertSame(customerRepository, customerRepository);
    }

    @Test
    void qualifierDependencyInjection() {
        CustomerSevice customerSevice = applicationContext.getBean(CustomerSevice.class);

        UserRepository normalUserRepository = applicationContext.getBean("normalUserRepository", UserRepository.class);
        UserRepository premiumUserRepository = applicationContext.getBean("premiumUserRepository", UserRepository.class);

        Assertions.assertSame(normalUserRepository, customerSevice.getNormalUserRepository());
        Assertions.assertSame(premiumUserRepository, customerSevice.getPremiumUserRepository());

    }


}
