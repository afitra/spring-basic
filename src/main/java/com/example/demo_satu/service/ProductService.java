package com.example.demo_satu.service;

import com.example.demo_satu.repository.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/*
    jika menggunkan @Componet akan otomatis dibuatkan bean
    dengan nama sesuai nama class (camecase)

    contoh
    ProductService
    productService

 */
@Component
public class ProductService {

    @Getter
    private ProductRepository productRepository;

    /*
     @Autowired digunakan untuk menentukan default contructor
     apabila terdapat lebih dari satu
    */
    @Autowired
    public ProductService(ProductRepository inputRepository) {
        this.productRepository = inputRepository;
    }


    public ProductService(ProductRepository inputRepository, String name) {
        this.productRepository = inputRepository;
    }
}
