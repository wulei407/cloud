package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    IServiceHi serviceHi;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name) {

        return serviceHi.sayHiFromClientOne(name);
    }

}
