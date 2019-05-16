package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class IServiceHiHystrix implements IServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry +" + name;
    }
}
