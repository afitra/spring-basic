package com.example.demo_satu.data;

import com.example.demo_satu.aware.IdAware;
import lombok.Getter;

public class Car implements IdAware {
    @Getter
    private String id;

    @Override
    public void setId(String input) {
        this.id = input;
    }
}
